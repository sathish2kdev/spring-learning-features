package com.app.profile.emitter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import com.app.profile.service.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

@RestController
@Slf4j
public class EmitterController {

	@Autowired
	ServiceImpl service;

	@GetMapping("/responseEmitter")
	public ResponseBodyEmitter responseEmitter() {
		ResponseBodyEmitter emittor = new ResponseBodyEmitter();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> {
			List<String> data = Arrays.asList("a", "e", "i", "o", "u");
			data.stream().forEach(p -> {
				randomDelay();
				try {
					emittor.send(p);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			emittor.complete();
		});
		executor.shutdown();
		return emittor;
	}

	public void randomDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GetMapping("/aggregate")
	public CompletableFuture<List<String>> aggregateApis() {
		List<String> urls = Arrays.asList(
				"https://fakestoreapi.com/products",
				"https://fakestoreapi.com/products",
				"https://fakestoreapi.com/products"
		);

		List<CompletableFuture<String>> futures = urls.parallelStream()
				.map(service::callApi)
				.collect(Collectors.toList());
		System.out.println("EXIT of Future");
		return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
				.thenApply(v -> futures.stream()
						.map(CompletableFuture::join)
						.collect(Collectors.toList()));

	}


@GetMapping("/aggregate1")
public ResponseEntity<List<String>> aggregateApis1() {
	List<String> urls = Arrays.asList(
			"https://fakestoreapi.com/products",
			"https://fakestoreapi.com/products",
			"https://fakestoreapi.com/products"
	);
	List<String> list = urls.parallelStream()
			.map(service::callApi1)
			.collect(Collectors.toList());
	return new ResponseEntity<>(list, HttpStatus.OK);
}

}
