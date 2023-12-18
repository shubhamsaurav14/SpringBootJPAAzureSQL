package com.spring.jpa.mssql.springbootjpa.model;

import lombok.Data;

@Data
public class ResponseImpl implements Response{
    private String firstName;
    private String city;
    private Integer Id;
    private String state;
    
}
