package com.spring.jpa.mssql.springbootjpa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.mssql.springbootjpa.model.Response;
import com.spring.jpa.mssql.springbootjpa.model.ResponseImpl;
import com.spring.jpa.mssql.springbootjpa.repository.CustomPostRepositoryImpl;
import com.spring.jpa.mssql.springbootjpa.service.AddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FirstController {
    @Autowired
    AddressService addressService;
    
    @Autowired
    private CustomPostRepositoryImpl customPostRepositoryImpl;

    /**
     * @return
     */
    @GetMapping(value="/test")
    public List<Response> getMethodName() {//@RequestParam String param
    	System.out.println();
        //AddressResponse ad = addressService.findAddressByEmployeeId(0);
    	List<Response> ad = addressService.findAddressByEmployeeId1(0);
        return ad;
    }
    
    @GetMapping(value="/test1")
    public List<ResponseImpl> getMethodName1() {//@RequestParam String param
    	System.out.println();
        //AddressResponse ad = addressService.findAddressByEmployeeId(0);
    	return customPostRepositoryImpl.findPostDTOWithComments();
    }
    

}
