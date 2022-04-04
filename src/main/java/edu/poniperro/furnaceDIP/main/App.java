package edu.poniperro.furnaceDIP.main;

import edu.poniperro.furnaceDIP.hardware.GasHeater;
import edu.poniperro.furnaceDIP.hardware.Regulator;
import edu.poniperro.furnaceDIP.hardware.RemoteCommandSensor;
import edu.poniperro.furnaceDIP.interfaces.Heater;
import edu.poniperro.furnaceDIP.interfaces.Thermometer;
import edu.poniperro.furnaceDIP.otherstuff.Jedi;
import edu.poniperro.furnaceDIP.types.RoomTemperature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(15);

        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
