package application;

public class Thermostat {
	public void setTemperature (double temperature) throws Exception {
		setMachineTemperature(temperature);
		System.out.println("Setting temperature to " + temperature);
	}
	
	public void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			throw new Exception("Temperature out of range");
		}
	}
}
