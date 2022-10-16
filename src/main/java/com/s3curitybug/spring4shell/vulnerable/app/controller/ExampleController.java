package com.s3curitybug.spring4shell.vulnerable.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.s3curitybug.spring4shell.vulnerable.app.dto.ExampleBody;

@RestController
@RequestMapping
public class ExampleController {

	@GetMapping()
	public String exampleGet() {

		return "Hello World!";

	}

	@PostMapping(path = "/example", produces = MediaType.APPLICATION_JSON_VALUE)
	public String examplePost(ExampleBody body) throws JsonProcessingException {

		return new ObjectMapper().writeValueAsString(body);

	}

}
