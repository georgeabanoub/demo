package com.example.demo.readServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Actors;
import com.example.demo.repository.ActorNameRepo;

import java.util.List;

@Service

public class ReadFromDB {
	@Autowired
	private ActorNameRepo actorNameRepo;
	
		public List<Actors> getAllNames() {
			return actorNameRepo.findAll();
	
	}

}
