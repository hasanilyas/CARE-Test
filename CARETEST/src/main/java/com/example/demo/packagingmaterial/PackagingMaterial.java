package com.example.demo.packagingmaterial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PackagingMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PackagingMaterial_ID")
	private int id;
	@Column(name="PackagingMaterial_Name")
	private String packagingmaterialName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackagingmaterialName() {
		return packagingmaterialName;
	}
	public void setPackagingmaterialName(String packagingmaterialName) {
		this.packagingmaterialName = packagingmaterialName;
	}
	
	
}
