package com.app.profile.jsonview;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class JsonViewController {

	@GetMapping("/jsonview")
	@JsonView(Views.ExternalView.class)
	public ResponseEntity<?> getDetails() throws JsonProcessingException {
		JsonDto v1 = new JsonDto();
		v1.setLoginId("1");
		v1.setUserName("sathish");
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.setSerializationInclusion(Include.NON_NULL);
//		String data =mapper.writeValueAsString(v1);
		
		return new ResponseEntity<JsonDto>(v1, HttpStatus.OK);
	}

	
	// Hide Variable in Dto based on we defined Type in JsonDto
	@PostMapping(path = "/userdetails")
	   public ResponseEntity<JsonDto> post(
	           @RequestBody @JsonView(value = Views.ExternalView.class) JsonDto user) {
	   return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
}
