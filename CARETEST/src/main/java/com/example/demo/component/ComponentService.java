package com.example.demo.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComponentService {
	@Autowired
	private ComponentRepository componentRepository;
	
	//Return all Component
	public List<Component> getAllComponents(){
		List<Component> componentList = new ArrayList<>();
		componentRepository.findAll().forEach(componentList::add);
		return componentList;
	}
	
	//Return Single Component
	public Component getComponent(int id){
		Optional<Component> optionalComponent= componentRepository.findById(id);
		if(optionalComponent.isPresent()){
			return optionalComponent.get();
			}	
		return null;
	}
	
	//Add New Component
	
	public void addComponent(Component component){
		componentRepository.save(component);
	}
	
	//Edit Component
	public void editComponent(Component component){
		componentRepository.save(component);
	}
	
	//Delete Component
	public void deleteComponent(int id){
		componentRepository.deleteById(id);
	}
}
