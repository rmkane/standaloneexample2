package com.github.ryankane.standaloneexample.model.mapper;

import com.github.ryankane.standaloneexample.model.dto.StandaloneDto;
import com.github.ryankane.standaloneexample.model.entity.Standalone;
import com.github.ryankane.standaloneexample.model.util.mapper.ListMapper;
import com.github.ryankane.standaloneexample.model.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=Standalone.class)
public class StandaloneMapper extends ListMapper<Standalone, StandaloneDto> {
	@Override
	public Standalone map(Standalone target, StandaloneDto source) {
		if (source != null) {
			target.setId(source.getId());
			target.setName(source.getName());
			target.setAmount(source.getAmount());
			target.setCreated(source.getCreated());
		}
		
		return target;
	}
}