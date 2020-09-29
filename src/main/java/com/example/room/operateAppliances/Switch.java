package com.example.room.operateAppliances;

import com.example.room.appliances.Fan;

public class Switch implements OperateAppliance {

	private int id;

	private Fan fan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Switch(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void on() {
		// on switch functionality
		fan.on();
	}

	@Override
	public void off() {
		// off switch functionality
		fan.off();
	}

}
