package com.techreturners.demoapp;

import java.beans.BeanProperty;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.aop.CountedAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
		return new TimedAspect(registry);
	}

	@Bean
	CountedAspect countedAspect(MeterRegistry registry) {
		return new CountedAspect(registry);
	}

}
