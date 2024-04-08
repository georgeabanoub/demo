package com.example.demo.readService;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.ActorsModel;
import com.example.demo.repository.ActorNameRepo;

import java.util.ArrayList;
import java.util.List;

public class ReadFromDB {
	
	@Autowired
	private ActorNameRepo repo;
	
	
	public List<ActorsModel> nameList() {
		List<String> firstNameList = new ArrayList<>();
		
		List<ActorsModel> names = repo.findAllNames(firstNameList);
		
		
		return names;
	}

}
