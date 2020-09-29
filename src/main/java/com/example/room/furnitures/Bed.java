package com.example.room.furnitures;

import java.awt.Dimension;

public class Bed implements Furniture {

	private int id;

	private int diameter;

	private String material;

	private int bulkDensity;

	private Dimension dimesions;

	private BedSheet bedSheet;

	private Pillow pillow;

	private Mattress mattress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getBulkDensity() {
		return bulkDensity;
	}

	public void setBulkDensity(int bulkDensity) {
		this.bulkDensity = bulkDensity;
	}

	public Dimension getDimesions() {
		return dimesions;
	}

	public void setDimesions(Dimension dimesions) {
		this.dimesions = dimesions;
	}

	public BedSheet getBedSheet() {
		return bedSheet;
	}

	public void setBedSheet(BedSheet bedSheet) {
		this.bedSheet = bedSheet;
	}

	public Pillow getPillow() {
		return pillow;
	}

	public void setPillow(Pillow pillow) {
		this.pillow = pillow;
	}

	public Mattress getMattress() {
		return mattress;
	}

	public void setMattress(Mattress mattress) {
		this.mattress = mattress;
	}

}
