package com.spring.jpa.mssql.springbootjpa.util;

public class QueryClass {
	
	public final static String q1 = "SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id";
	
	public final static String q2 = "SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM :table join dbo.employeeS e on e.id = ea.employee_id";

}
