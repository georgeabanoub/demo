package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.ActorsModel;

public interface ActorNameRepo extends JpaRepository<ActorsModel, Long> {
	@Transactional
	ActorsModel findByFirstName(String firstName);
	
	@Transactional
	ActorsModel findByLastName(String lastName);
	
}
