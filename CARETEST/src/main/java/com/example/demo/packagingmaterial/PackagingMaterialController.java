package com.example.demo.packagingmaterial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PackagingMaterialController {
	@Autowired
	private PackagingMaterialService packagingmaterialService;
	
	
	//GET
	@RequestMapping(value = "/packagingmaterials", method = RequestMethod.GET)  //localhost:8080/warehouses
	@CrossOrigin(origins = "http://localhost:4200")
	public List<PackagingMaterial> getPackagingMaterial(){
		return packagingmaterialService.getAllPackagingMaterials();
	}
	
	@RequestMapping(value ="/packagingmaterials/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public PackagingMaterial getPackagingMaterialById(@PathVariable int id){
		return packagingmaterialService.getPackagingMaterial(id);
	}
	
	//POST
	@RequestMapping(value="/packagingmaterials/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void addPackagingMaterial(@RequestBody PackagingMaterial packagingmaterial){
		packagingmaterialService.addPackagingMaterial(packagingmaterial);
	}
	
	//PUT
	@RequestMapping(value="/packagingmaterials/edit", method = RequestMethod.PUT)
	@CrossOrigin(origins = "http://localhost:4200")
	public void editPackagingMaterial(@RequestBody PackagingMaterial packagingmaterial){
		packagingmaterialService.editPackagingMaterial(packagingmaterial);
	}
	
	//Delete
	@RequestMapping(value="/packagingmaterials/delete/{id}", method= RequestMethod.DELETE)
	@CrossOrigin(origins = "http://localhost:4200")
	public void deletePackagingMaterial(@PathVariable int id){
		packagingmaterialService.deletePackagingMaterial(id);
	}
}
