package com.example.demo.component;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="http://localhost:4200")
public interface ComponentRepository extends CrudRepository<Component, Integer>{

}
