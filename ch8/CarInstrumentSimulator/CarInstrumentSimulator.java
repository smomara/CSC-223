package CarInstrumentSimulator;

public class CarInstrumentSimulator {
	public static void main(String[] args) {
		FuelGauge fg = new FuelGauge();
		Odometer o = new Odometer();
		
		o.setFuelGauge(fg);
		
		int count = 0;
		while(fg.getFuel() > 0) {
			o.incrementMileage();
			count++;
			
			System.out.println("Mile " + count);
			System.out.println(o.getMileage());
			System.out.println(fg.getFuel());
			System.out.println();
		}
	}
}
