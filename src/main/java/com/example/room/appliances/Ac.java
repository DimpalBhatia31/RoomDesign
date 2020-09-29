package com.example.room.appliances;

import com.example.room.operateAppliances.AcRemote;

public class Ac implements Appliances {

	private int id;

	private String companyName;

	private AcRemote acRemote;

	private int temperature;
	
	private int timer;


	public int getTimer() {
		return timer;
	}


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

	public void setTimer(int timer) {
		this.timer = timer;
		off();
	}

	@Override
	public void on() {
		System.out.println("On Ac functionallity");
	}

	@Override
	public void off() {
		System.out.println("Off Ac functionality");

	}

	public AcRemote getAcRemote() {
		return acRemote;
	}

	public void setAcRemote(AcRemote acRemote) {
		this.acRemote = acRemote;
	}

	public void increaseTemperature() {
		temperature++;
	}

	public void decreaseTemperature() {
		temperature--;
	}

}