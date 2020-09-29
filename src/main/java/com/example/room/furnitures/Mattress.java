package com.example.room.furnitures;

import java.awt.Dimension;

public class Mattress {

	private int id;

	private String companyName;

	private int padding;

	private Dimension dimesions;

	private boolean durable;

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

	public int getPadding() {
		return padding;
	}

	public void setPadding(int padding) {
		this.padding = padding;
	}

	public Dimension getDimesions() {
		return dimesions;
	}

	public void setDimesions(Dimension dimesions) {
		this.dimesions = dimesions;
	}

	public boolean isDurable() {
		return durable;
	}

	public void setDurable(boolean durable) {
		this.durable = durable;
	}

}
