package com.zyq.myemptyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.zyq.myemptyproject.entity")
@EnableJpaRepositories(basePackages={"com.zyq.myemptyproject.dao"})
@ComponentScan(value={"com.zyq.myemptyproject.*","com.zyq.myemptyproject.dao"})
@SpringBootApplication
public class MyEmptyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEmptyProjectApplication.class, args);
	}

}
