package com.example.demo.rawmaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RawmaterialService {
	@Autowired
	private RawmaterialRepository rawmaterialRepository;
	
	//Return all Rawmaterial
	public List<Rawmaterial> getAllRawmaterials(){
		List<Rawmaterial> rawmaterialList = new ArrayList<>();
		rawmaterialRepository.findAll().forEach(rawmaterialList::add);
		return rawmaterialList;
	}
	
	//Return Single Rawmaterial
	public Rawmaterial getRawmaterial(int id){
		Optional<Rawmaterial> optionalRawmaterial= rawmaterialRepository.findById(id);
		if(optionalRawmaterial.isPresent()){
			return optionalRawmaterial.get();
			}	
		return null;
	}
	
	//Add New Rawmaterial
	
	public void addRawmaterial(Rawmaterial component){
		rawmaterialRepository.save(component);
	}
	
	//Edit Rawmaterial
	public void editRawmaterial(Rawmaterial component){
		rawmaterialRepository.save(component);
	}
	
	//Delete Rawmaterial
	public void deleteRawmaterial(int id){
		rawmaterialRepository.deleteById(id);
	}
}
