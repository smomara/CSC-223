package CarInstrumentSimulator;

public class Odometer {
	private int mileage = 0;
	private int mpgCounter = 0;
	private FuelGauge gauge;
	
	public void setFuelGauge(FuelGauge fg) {
		gauge = fg;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void incrementMileage() {
		if (mileage < 999999) mileage++;
		else mileage = 0;
		
		mpgCounter++;
		if (mpgCounter == 24) {
			gauge.decrementFuel();
			mpgCounter = 0;
		}
	}
}
