package com.spring.jpa.mssql.springbootjpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	return new ModelMapper();
	}
	
	@Bean("temp")
	public String query() {
	return new String("SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id");
	}

	@Bean
	public String query1() {
	return new String("SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id");
	}
}
