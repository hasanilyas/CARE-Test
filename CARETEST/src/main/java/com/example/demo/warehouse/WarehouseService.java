package com.example.demo.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
	
	@Autowired
	private WarehouseRepository warehouseRepository;
	
	//Return all Warehouses
	public List<Warehouse> getAllWarehouses(){
		List<Warehouse> warehouseList = new ArrayList<>();
		warehouseRepository.findAll().forEach(warehouseList::add);
		return warehouseList;
	}
	
	//Return Single WareHouse
	public Warehouse getWarehouse(int id){
		Optional<Warehouse> optionalWarehouse= warehouseRepository.findById(id);
		if(optionalWarehouse.isPresent()){
			return optionalWarehouse.get();
			}	
		return null;
	}
	
	//Add New Warehouse
	
	public void addWarehouse(Warehouse warehouse){
		warehouseRepository.save(warehouse);
	}
	
	//Edit Warehouse
	public void editWarehouse(Warehouse warehouse){
		warehouseRepository.save(warehouse);
	}
	
	//Delete Warehouse
	public void deleteWarehouse(int id){
		warehouseRepository.deleteById(id);
	}
}
