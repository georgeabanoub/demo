package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.readService.ReadFromDB;
import com.example.demo.models.ActorsModel;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/read")

public class ReadController {
	
	@Autowired
	private ReadFromDB readAll;
	
	@GetMapping("/readAll")
	
	public ResponseEntity<List<ActorsModel>> getNames(){
		return new ResponseEntity<List<ActorsModel>>(readAll.nameList(), HttpStatus.OK);
		
	}

}
