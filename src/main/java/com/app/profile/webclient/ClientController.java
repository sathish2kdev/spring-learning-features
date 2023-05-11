package com.app.profile.webclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class ClientController {

	@Autowired
	WebClient webClient;

	@GetMapping("/s")
	public Mono<ResponseEntity<List>> getDetails() {
		return webClient.get().uri("http://localhost:8090/1").retrieve().toEntity(List.class);
//	System.out.println(details);
	}

}
