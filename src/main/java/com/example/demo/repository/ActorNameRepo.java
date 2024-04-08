package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.ActorsModel;

public interface ActorNameRepo extends JpaRepository<ActorsModel, Long> {
	@Transactional
	ActorsModel findByFirstName(String firstName);
	
	@Transactional
	ActorsModel findByLastName(String lastName);
	
	@Query(value = "SELECT first_name FROM actor", nativeQuery = true)
			List<ActorsModel> findAllNames(List<String> firstNameList);
}
