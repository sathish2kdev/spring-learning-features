package com.app.profile.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.app.profile.entity.StudentSample;
import com.app.profile.repository.StudentSampleRepo;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ServiceImpl {

	private final RestTemplate restTemplate = new RestTemplate();

//	@Autowired
	StudentSampleRepo studentSample;

	public ServiceImpl(StudentSampleRepo studentSampleRepo) {
		this.studentSample = studentSampleRepo;
	}

	// @Log
	public void justPrint() {
		System.out.println("hello");
	}

	public void justPrintWithValue(Long id) throws Exception {

		try {
			double d = id / 2;
			System.out.println("MY ID IS : " + d);
		} catch (Exception e) {
//			e.printStackTrace();
			throw new Exception(e);
		}

	}

	public List<StudentSample> findAllDetails() {
		return studentSample.findAll();
	}

	@Async
	public CompletableFuture<String> callApi(String url) {
		try {

			Thread.sleep(5000);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		String response = restTemplate.getForObject(url, String.class);
		return CompletableFuture.completedFuture("Response from " + url + ": " + response);
	}

	@Async
	public String callApi1(String url) {
		try {

			Thread.sleep(5000);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return restTemplate.getForObject(url, String.class);
	}
}
