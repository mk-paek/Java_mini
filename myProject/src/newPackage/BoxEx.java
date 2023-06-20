package newPackage;

public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		String str = box1.get();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		int value = box2.get();
		System.out.println(value);
	}

}
