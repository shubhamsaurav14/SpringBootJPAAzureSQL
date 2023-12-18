package com.spring.jpa.mssql.springbootjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.jpa.mssql.springbootjpa.model.Response;
import com.spring.jpa.mssql.springbootjpa.model.RootEntity;
import com.spring.jpa.mssql.springbootjpa.util.QueryClass;

public interface MyRepository extends JpaRepository<RootEntity, Integer>{
	
//	@Query( 
//	        nativeQuery = true, 
//	        value 
//	        = QueryClass.q1)
//	    List<Response> findAddressByEmployeeId(@Param("employeeId") int employeeId);
	
	
	@Query( 
	        nativeQuery = true, 
	        value 
	        = QueryClass.q2)
	    List<Response> findAddressByEmployeeId(@Param("table") String table);

}
