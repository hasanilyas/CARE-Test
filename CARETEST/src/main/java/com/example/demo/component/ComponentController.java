package com.example.demo.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ComponentController {
	@Autowired
	private ComponentService componentService;
	
	
	//GET
	@RequestMapping(value = "/components", method = RequestMethod.GET)  //localhost:8080/warehouses
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Component> getComponent(){
		return componentService.getAllComponents();
	}
	
	@RequestMapping(value ="/components/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Component getComponentById(@PathVariable int id){
		return componentService.getComponent(id);
	}
	
	//POST
	@RequestMapping(value="/components/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void addComponent(@RequestBody Component component){
		componentService.addComponent(component);
	}
	
	//PUT
	@RequestMapping(value="/components/edit", method = RequestMethod.PUT)
	@CrossOrigin(origins = "http://localhost:4200")
	public void editComponent(@RequestBody Component component){
		componentService.editComponent(component);
	}
	
	//Delete
	@RequestMapping(value="/components/delete/{id}", method= RequestMethod.DELETE)
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteComponent(@PathVariable int id){
		componentService.deleteComponent(id);
	}
}
