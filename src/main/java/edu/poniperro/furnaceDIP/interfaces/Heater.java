package edu.poniperro.furnaceDIP.interfaces;

import edu.poniperro.furnaceDIP.types.RoomTemperature;

public interface Heater {
	
	public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);

}
