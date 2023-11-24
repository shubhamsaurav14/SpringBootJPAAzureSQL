package com.spring.jpa.mssql.springbootjpa.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class AddressResponse {
	private String first_name;
    private int id; 
    private String city; 
    private String state;
    
}
