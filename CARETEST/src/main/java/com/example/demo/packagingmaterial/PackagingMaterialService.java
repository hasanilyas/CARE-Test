package com.example.demo.packagingmaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackagingMaterialService {
	@Autowired
	private PackagingMaterialRepository packagingmaterialRepository;
	
	//Return all PackagingMaterial
	public List<PackagingMaterial> getAllPackagingMaterials(){
		List<PackagingMaterial> packagingmaterialList = new ArrayList<>();
		packagingmaterialRepository.findAll().forEach(packagingmaterialList::add);
		return packagingmaterialList;
	}
	
	//Return Single PackagingMaterial
	public PackagingMaterial getPackagingMaterial(int id){
		Optional<PackagingMaterial> optionalPackagingMaterial= packagingmaterialRepository.findById(id);
		if(optionalPackagingMaterial.isPresent()){
			return optionalPackagingMaterial.get();
			}	
		return null;
	}
	
	//Add New PackagingMaterial
	
	public void addPackagingMaterial(PackagingMaterial packagingmaterial){
		packagingmaterialRepository.save(packagingmaterial);
	}
	
	//Edit PackagingMaterial
	public void editPackagingMaterial(PackagingMaterial packagingmaterial){
		packagingmaterialRepository.save(packagingmaterial);
	}
	
	//Delete PackagingMaterial
	public void deletePackagingMaterial(int id){
		packagingmaterialRepository.deleteById(id);
	}
}
