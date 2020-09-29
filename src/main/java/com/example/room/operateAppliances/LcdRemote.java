package com.example.room.operateAppliances;

import com.example.room.appliances.Lcd;

public class LcdRemote implements OperateAppliance {

	private int id;

	private Lcd lcd;

	private int volume;

	public LcdRemote(Lcd lcd) {
		this.lcd = lcd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void on() {
		// lcd remote on functionality
		lcd.on();
	}

	@Override
	public void off() {
		// lcd remote of functionality
		lcd.off();
	}
	
	public void increaseVolume()
	{
		volume++;
		lcd.setVolume(volume);
	}
	
	public void decreaseVolume()
	{
		volume--;
		lcd.setVolume(volume);
	}


}
