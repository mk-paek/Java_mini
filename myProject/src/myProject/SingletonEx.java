package myProject;

class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		
		//Singleton s1 = new Singleton();
		// Singleton s2 = new Singleton();0
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 Singleton 객체 입니다.");
		} else {
			System.out.println("s1과 s2는 다른 Singleton 객체 입니다.");
		}
	}
	
}
