package com.karvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karvy.modal.AuthorEntity;
import com.karvy.service.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI homeService;

	@Value("${article.name}")
	String articleName;
	
	@Value("${article.author}")
	String articleAuthor;
	
	@RequestMapping("/api")
	public String hello() {

		return "Kalyan123";
	}

	@PostMapping("/addArticle")
	public ResponseEntity<AuthorEntity> addArticle(@RequestBody AuthorEntity author) {
		
		System.out.println(articleAuthor+" *************  "+articleName);
		return new ResponseEntity<AuthorEntity>(homeService.addAuthor(author),HttpStatus.OK);
	}
}
