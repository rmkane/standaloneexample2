package com.github.ryankane.standaloneexample.model.mapper;

import com.github.ryankane.standaloneexample.model.dto.StandaloneDto;
import com.github.ryankane.standaloneexample.model.entity.Standalone;
import com.github.ryankane.standaloneexample.model.util.mapper.ListMapper;
import com.github.ryankane.standaloneexample.model.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=StandaloneDto.class)
public class StandaloneDtoMapper extends ListMapper<StandaloneDto, Standalone> {
	@Override
	public StandaloneDto map(StandaloneDto target, Standalone source) {
		if (source != null) {
			target.setId(source.getId());
			target.setName(source.getName());
			target.setAmount(source.getAmount());
			target.setCreated(source.getCreated());
		}
		
		return target;
	}
}