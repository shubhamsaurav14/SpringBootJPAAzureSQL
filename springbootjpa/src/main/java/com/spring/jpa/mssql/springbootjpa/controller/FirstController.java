package com.spring.jpa.mssql.springbootjpa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.mssql.springbootjpa.model.Response;
import com.spring.jpa.mssql.springbootjpa.service.AddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FirstController {
    @Autowired
    AddressService addressService;

    @GetMapping(value="/test")
    public List<Response> getMethodName() {//@RequestParam String param
    	System.out.println();
        //AddressResponse ad = addressService.findAddressByEmployeeId(0);
    	List<Response> ad = addressService.findAddressByEmployeeId(0);
        return ad;
    }
    

}
