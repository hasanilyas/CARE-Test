package com.example.demo.packagingmaterial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins ="http://localhost:4200")
public interface PackagingMaterialRepository extends CrudRepository<PackagingMaterial, Integer>{

}
