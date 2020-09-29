package com.example.room.appliances;

import com.example.room.operateAppliances.LcdRemote;

public class Lcd implements Appliances {

	private int id;

	private String companyName;

	private int volume;

	private LcdRemote lcdRemote;

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

	public void increaseVolume() {
		volume++;
	}

	public void decreaseVolume() {
		volume--;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public LcdRemote getLcdRemote() {
		return lcdRemote;
	}

	public void setLcdRemote(LcdRemote lcdRemote) {
		this.lcdRemote = lcdRemote;
	}

}
