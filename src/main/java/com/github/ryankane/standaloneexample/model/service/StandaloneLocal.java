package com.github.ryankane.standaloneexample.model.service;

import java.util.List;

import com.github.ryankane.standaloneexample.model.dto.StandaloneDto;

public interface StandaloneLocal {
	List<StandaloneDto> retrieveAll();

	StandaloneDto save(StandaloneDto standalone);
}
