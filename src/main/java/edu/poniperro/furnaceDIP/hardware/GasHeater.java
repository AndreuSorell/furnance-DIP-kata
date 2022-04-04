package edu.poniperro.furnaceDIP.hardware;

import edu.poniperro.furnaceDIP.interfaces.Heater;
import edu.poniperro.furnaceDIP.types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}
