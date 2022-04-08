package com.grupoM.mcordero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAutoConfiguration

@SpringBootApplication
@ComponentScan(basePackages={"com.grupoM.mcordero.domain","com.grupoM.mcordero.Entity","com.grupoM.mcordero.Repositories","com.grupoM.mcordero.Services"})
public class EpicoBecasBackedMApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpicoBecasBackedMApplication.class, args);
	}

}
