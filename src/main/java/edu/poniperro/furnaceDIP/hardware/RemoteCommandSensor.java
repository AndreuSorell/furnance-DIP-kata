package edu.poniperro.furnaceDIP.hardware;

import edu.poniperro.furnaceDIP.interfaces.Thermometer;
import edu.poniperro.furnaceDIP.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
