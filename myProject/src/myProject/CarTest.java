package myProject;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		c1.speed = 80;
		
		Car c2 = new Car("Red", "auto", 3);
		c2.speed = 80;
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door + ", speed=" + c1.speed);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door + ", speed=" + c2.speed);
		c2.drive();
	}

}
