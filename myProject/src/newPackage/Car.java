package newPackage;

public class Car {
	Tire flTire = new HKTire();  // front left
	Tire frTire = new HKTire();  // front right
	Tire blTire = new HKTire();  // back left
	Tire brTire = new HKTire();  // back right
	
	void run() {
		flTire.roll();
		frTire.roll();
		blTire.roll();
		brTire.roll();
	}
}
