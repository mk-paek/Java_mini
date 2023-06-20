package myProject;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		double result1 = c.areaRectangle(10);
		
		double result2 = c.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
	}

}
