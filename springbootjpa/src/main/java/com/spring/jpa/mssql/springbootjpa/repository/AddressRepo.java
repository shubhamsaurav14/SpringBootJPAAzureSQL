package com.spring.jpa.mssql.springbootjpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository; 
import com.spring.jpa.mssql.springbootjpa.model.Address;
import com.spring.jpa.mssql.springbootjpa.model.Response;
import com.spring.jpa.mssql.springbootjpa.response.AddressResponse;
import com.spring.jpa.mssql.springbootjpa.util.QueryClass;
  
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> { 
  
	String q= "SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id";
	
    @Query( 
        nativeQuery = true, 
        value 
        = QueryClass.q1)
    List<Response> findAddressByEmployeeId(@Param("employeeId") int employeeId); 
}
