package com.example.demo.warehouse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Warehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Warehouse_ID")
	private int id;
	@Column(name="Warehouse_Name")
	private String warehouseName;
	@Column(name = "City")
	private String city;

	
	
	public Warehouse(int i, String string, String string2) {
		this.id = i ;
		this.warehouseName = string;
		this.city = string2;
	}
	
	public Warehouse(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
