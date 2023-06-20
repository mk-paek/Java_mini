package newPackage;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("=============================================");
		
		myCar.flTire = new KumhoTire();
		myCar.frTire = new KumhoTire();
		
		myCar.run();
		
		
	}

}
