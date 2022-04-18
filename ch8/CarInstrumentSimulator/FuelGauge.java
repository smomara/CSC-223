package CarInstrumentSimulator;

public class FuelGauge {
	private int amountFuel = 15;
	
	public int getFuel() {
		return amountFuel;
	}
	
	public void incrementFuel() {
		if (amountFuel < 15) amountFuel++;
		else System.out.println("Fuel has reached maximum of 15 gallons");
	}
	
	public void decrementFuel() {
		if (amountFuel > 0) amountFuel--;
		else System.out.println("Fuel has run out");
	}
}
