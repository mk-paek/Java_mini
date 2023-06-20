package myProject;

class Car {
	// 필드
	String color;
	String gearType;
	int door;
	int speed;
	
	//생성자 메서드
	Car(){}
	Car(String color){ 
		this(color, "auto", 3);
	}
	Car(String color, String gearType){
		
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	// 메서드
	void drive() {
		System.out.println(" 달립니다~");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
