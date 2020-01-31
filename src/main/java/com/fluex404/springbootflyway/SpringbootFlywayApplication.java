package com.fluex404.springbootflyway;

import com.fluex404.springbootflyway.model.A;
import com.fluex404.springbootflyway.model.C;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFlywayApplication {

	@Autowired
	A a;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFlywayApplication.class, args);
	}

}
