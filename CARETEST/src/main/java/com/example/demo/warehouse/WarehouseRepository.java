package com.example.demo.warehouse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins ="http://localhost:4200")
public interface WarehouseRepository extends CrudRepository<Warehouse, Integer> {
	
}
