package com.spring.jpa.mssql.springbootjpa.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.jpa.mssql.springbootjpa.model.ResponseImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CustomPostRepositoryImpl implements CustomPostRepository {
     
    @PersistenceContext
    private EntityManager entityManager;
 
    @Override
    public List<ResponseImpl> findPostDTOWithComments() {
        return entityManager.createNativeQuery("""
            SELECT e.first_name as firstName, ea.id as id, ea.city as city, ea.state as state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id
            """)
//        .unwrap(org.hibernate.query.Query.class)
//        .setResultTransformer(new ResponseImpl())
        .getResultList();
    }
}
