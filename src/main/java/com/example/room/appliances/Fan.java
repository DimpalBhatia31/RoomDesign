package com.example.room.appliances;

import com.example.room.operateAppliances.Switch;

public class Fan implements Appliances {

	private int id;

	private String companyName;
	
	private Switch fanSwicth;
	
	
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

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

}
