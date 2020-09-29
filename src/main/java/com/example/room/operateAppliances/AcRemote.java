package com.example.room.operateAppliances;

import com.example.room.appliances.Ac;

public class AcRemote implements OperateAppliance {

	private int id;

	private Ac ac; 
	
	private int timer;
	
	public AcRemote(Ac ac) {
		this.ac = ac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void on() {
		// on functionality of remote
		ac.on();
	}

	@Override
	public void off() {
		// Off functionality of remote
		ac.off();
	}

	public void setTimer(int timer) {
		this.timer = timer;
		ac.setTimer(timer);
	}
	
	public void increaseTemperature( )
	{
		// remote functionality
		ac.increaseTemperature();
	}
	
	public void decreaseTemperature()
	{
		// remote decrease functionality
		ac.decreaseTemperature();
	}
	
	

}
