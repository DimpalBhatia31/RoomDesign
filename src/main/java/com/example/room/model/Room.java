package com.example.room.model;

import java.util.List;

import com.example.room.appliances.Appliances;
import com.example.room.furnitures.Furniture;

public class Room {

	private int id;

	private String name;

	private List<Appliances> appliances;

	private List<Furniture> furnitures;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Appliances> getAppliances() {
		return appliances;
	}

	public void setAppliances(List<Appliances> appliances) {
		this.appliances = appliances;
	}

	public List<Furniture> getFurnitures() {
		return furnitures;
	}

	public void setFurnitures(List<Furniture> furnitures) {
		this.furnitures = furnitures;
	}

}
