package com.crud_demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud_demo.entity.Registration;

public interface StudentCrud extends CrudRepository< Registration , String> {

}
