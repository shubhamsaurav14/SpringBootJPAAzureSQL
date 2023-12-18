package com.spring.jpa.mssql.springbootjpa.service;


import com.spring.jpa.mssql.springbootjpa.model.Response;
//import com.spring.jpa.mssql.springbootjpa.model.Address;
import com.spring.jpa.mssql.springbootjpa.repository.AddressRepo;
import com.spring.jpa.mssql.springbootjpa.repository.MyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
    
    @Autowired
    private MyRepository myRepository;

    public List<Response> findAddressByEmployeeId(int employeeId) {
    	List<Response> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        //Object a = addressByEmployeeId.get();
        //System.out.println(a.getClass());
        //AddressResponse ad = (AddressResponse)a;
       // AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressByEmployeeId;
    }
    
    public List<Response> findAddressByEmployeeId1(int employeeId) {
    	
    	String table = "dbo.address ea";
    	List<Response> addressByEmployeeId = myRepository.findAddressByEmployeeId(table);
        //Object a = addressByEmployeeId.get();
        //System.out.println(a.getClass());
        //AddressResponse ad = (AddressResponse)a;
       // AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressByEmployeeId;
    }

}
