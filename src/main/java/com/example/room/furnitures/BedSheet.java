package com.example.room.furnitures;

import java.awt.Dimension;
import java.util.List;

public class BedSheet {

	private int id;

	private String companyName;

	private String colour;

	private String fabric;

	private Dimension dimensions;

	private List<PillowCover> pillowCovers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	public List<PillowCover> getPillowCovers() {
		return pillowCovers;
	}

	public void setPillowCovers(List<PillowCover> pillowCovers) {
		this.pillowCovers = pillowCovers;
	}

}
