package com.example.demo.rawmaterial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rawmaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Rawmaterial_ID")
	private int id;
	@Column(name="Rawmaterial_Name")
	private String rawmaterialName;
	
	public Rawmaterial() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRawmaterialName() {
		return rawmaterialName;
	}
	
	public void setRawmaterialName(String rawmaterialName) {
		this.rawmaterialName = rawmaterialName;
	}

}
