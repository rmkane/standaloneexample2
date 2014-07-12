package com.github.ryankane.standaloneexample;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.github.ryankane.standaloneexample.model.dto.StandaloneDto;
import com.github.ryankane.standaloneexample.model.service.StandaloneLocal;

@Component
public class StandaloneExample {

	@Autowired
	private StandaloneLocal standaloneService;

	public static void main(final String[] args) throws Exception {
		ConfigurableApplicationContext ctx = null;
		StandaloneExample standalone = null;

		try {
			ctx = new ClassPathXmlApplicationContext("spring-config.xml");
			standalone = ctx.getBean(StandaloneExample.class);
			standalone.startStandalone();
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}

	private void startStandalone() {
		StandaloneDto standalone = createNewStandalone("Test1", 239.32);

		standaloneService.save(standalone);

		List<StandaloneDto> result = standaloneService.retrieveAll();

		for (StandaloneDto dto : result) {
			System.out.println(dto);
		}
	}
	
	private StandaloneDto createNewStandalone(String name, double amount) {
		StandaloneDto standalone = new StandaloneDto();

		standalone.setName(name);
		standalone.setAmount(amount);
		standalone.setCreated(new Date());
		
		return standalone;
	}
}
