package com.api.galaxy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.galaxy.model.BlackHole;

public interface BlackHoleRepositpry extends JpaRepository<BlackHole, Long>{
	
	Optional<BlackHole> findByRedshift(Double predic);
}