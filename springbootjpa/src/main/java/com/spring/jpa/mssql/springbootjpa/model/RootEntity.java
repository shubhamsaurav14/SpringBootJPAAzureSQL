package com.spring.jpa.mssql.springbootjpa.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RootEntity {
	@Id
    private Integer id;
}
