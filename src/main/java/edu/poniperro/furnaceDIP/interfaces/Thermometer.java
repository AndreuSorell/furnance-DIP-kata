package edu.poniperro.furnaceDIP.interfaces;

import edu.poniperro.furnaceDIP.types.RoomTemperature;

public interface Thermometer {
	
	public double read(RoomTemperature temperature);
}
