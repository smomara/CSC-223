package Ship;

public class ShipDemo {
	public static void main(String[] args) {
		Ship[] shipArr = new Ship[5];
		
		shipArr[0] = new Ship("SS Peverall", "2002");
		shipArr[1] = new CruiseShip("Margaritaville", "1976", 1500);
		shipArr[2] = new CargoShip("SS Baldwin", "1999", 54);
		shipArr[3] = new CruiseShip("Floaty McGee", "2006", 2500);
		shipArr[4] = new CruiseShip("The 3 Hour Tour", "2009", 8122);
		
		for (int i = 0; i < shipArr.length; i++) {
			System.out.println(shipArr[i] + "\n");
		}
	}
}
