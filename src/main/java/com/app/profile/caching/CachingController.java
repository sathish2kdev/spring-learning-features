package com.app.profile.caching;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CachingController {

//	@GetMapping("/cacheapi")
//	@Cacheable(value = "cacheapi")
//	public ResponseEntity<?> checkingCaching(){
//		try {
//			List<String> data = Arrays.asList("MS DHONI,VIART KHOLI,ROHIT SHARAMA,SACHIN TENDULKAR");
//			System.out.println("HELLO");
//			return new ResponseEntity<List<String>>(data,HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
//		}
//	}
	
	@GetMapping("/cacheapi")
	@Cacheable(value = "cacheapi")
	public ResponseEntity<?> checkingCaching(){
		try {
			List<String> data = Arrays.asList("MSD,VIART KHOLI,ROHIT SHARAMA,SACHIN TENDULKAR");
			System.out.println("HELLO");
			return new ResponseEntity<List<String>>(data,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
}
