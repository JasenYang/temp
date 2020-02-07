package com.feilong.mvcstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.feilong.mvcstu.repository"})
public class MvcstuApplication {
	public static void main(String[] args) {
		SpringApplication.run(MvcstuApplication.class, args);
	}
}
