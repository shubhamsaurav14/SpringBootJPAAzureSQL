package com.spring.jpa.mssql.springbootjpa.repository;

import java.util.List;

import com.spring.jpa.mssql.springbootjpa.model.ResponseImpl;

public interface CustomPostRepository {
 
    List<ResponseImpl> findPostDTOWithComments();
}
