package com.example.demo.rawmaterial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RawmaterialController {
	@Autowired
	private RawmaterialService rawmaterialService;
	
	
	//GET
	@RequestMapping(value = "/rawmaterials", method = RequestMethod.GET)  //localhost:8080/warehouses
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Rawmaterial> getRawmaterial(){
		return rawmaterialService.getAllRawmaterials();
	}
	
	@RequestMapping(value ="/rawmaterials/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Rawmaterial getRawmaterialById(@PathVariable int id){
		return rawmaterialService.getRawmaterial(id);
	}
	
	//POST
	@RequestMapping(value="/rawmaterials/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void addRawmaterial(@RequestBody Rawmaterial rawmaterial){
		rawmaterialService.addRawmaterial(rawmaterial);
	}
	
	//PUT
	@RequestMapping(value="/rawmaterials/edit", method = RequestMethod.PUT)
	@CrossOrigin(origins = "http://localhost:4200")
	public void editRawmaterial(@RequestBody Rawmaterial rawmaterial){
		rawmaterialService.editRawmaterial(rawmaterial);
	}
	
	//Delete
	@RequestMapping(value="/rawmaterials/delete/{id}", method= RequestMethod.DELETE)
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteRawmaterial(@PathVariable int id){
		rawmaterialService.deleteRawmaterial(id);
	}

}
