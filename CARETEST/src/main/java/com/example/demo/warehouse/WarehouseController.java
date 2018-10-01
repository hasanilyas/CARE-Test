package com.example.demo.warehouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WarehouseController {
	

	@Autowired
	private WarehouseService warehouseService;
	
	
	//GET
	@RequestMapping(value = "/warehouses", method = RequestMethod.GET)  //localhost:8080/warehouses
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Warehouse> getWarehouse(){
		return warehouseService.getAllWarehouses();
	}
	
	@RequestMapping(value ="/warehouses/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Warehouse getWarehouseById(@PathVariable int id){
		return warehouseService.getWarehouse(id);
	}
	
	//POST
	@RequestMapping(value="/warehouses/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void addWarehouse(@RequestBody Warehouse warehouse){
		 warehouseService.addWarehouse(warehouse);
	}
	
	//PUT
	@RequestMapping(value="/warehouses/edit", method = RequestMethod.PUT)
	@CrossOrigin(origins = "http://localhost:4200")
	public void editWarehouse(@RequestBody Warehouse warehouse){
		warehouseService.editWarehouse(warehouse);
	}
	
	//Delete
	@RequestMapping(value="/warehouses/delete/{id}", method= RequestMethod.DELETE)
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteWarehouse(@PathVariable int id){
		warehouseService.deleteWarehouse(id);
	}

}
