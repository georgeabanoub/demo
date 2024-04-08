package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Actors;
import com.example.demo.readServices.ReadFromDB;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/read")

public class ReadController {
	
	@Autowired
	private ReadFromDB readAll;
	
	@GetMapping("/readAllNames")
	public ResponseEntity<List<Actors>> getNames(){
		List<Actors> namesList = readAll.getAllNames();
		
		return new ResponseEntity<List<Actors>>(namesList, HttpStatus.OK);
		
	}

}
