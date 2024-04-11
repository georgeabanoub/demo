package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Actors;

@Repository

public interface ActorNameRepo extends JpaRepository<Actors, Long> {
	
}
