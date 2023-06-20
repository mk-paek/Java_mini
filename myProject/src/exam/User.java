package exam;

public class User implements java.io.Serializable {
	String name;
	String password;
	int age;
	
	public User() {
		this("Unkown", "1111", 0);
	}
	
	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString() {
		return "(" + name + "," + password + "," + age + ")";
	}
}
