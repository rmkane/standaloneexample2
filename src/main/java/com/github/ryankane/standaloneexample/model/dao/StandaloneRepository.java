package com.github.ryankane.standaloneexample.model.dao;

import java.util.List;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

public interface StandaloneRepository {
	List<Standalone> findAll();

	Standalone save(Standalone standalone);
}
