package myProject;

public class MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.sub(200L, 100L));
		System.out.println(MyMath2.mul(200L, 100L));
		System.out.println(MyMath2.div(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());
	}

}


class MyMath2 {
	long a, b;
	
	long add() { return a + b; }
	long sub() { return a - b; }
	long mul() { return a * b ; }
	long div() { return a / b ; }
	
	static long add(long a, long b) { return a + b; }
	static long sub(long a, long b) { return a - b; }
	static long mul(long a, long b) { return a * b ; }
	static double div(double a, double b) { return a / b ; }
}