package myProject;

public class Student extends People {
	private String sno;
	private String gender;   
	private int grade;
	private int age;
	private String address;
	private String phone;
	
	public Student(String name, String ssn, String sno, String gender) {
		super(name, ssn);
		this.sno = sno;
		this.gender = gender;
	}
	
	public String getSno() {  // getter
		return sno;
	}
	public void setSno(String sno) {   // setter
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	void enter() {};
	void study() {};
	void exam() {};
	void promote() {};
	void graduate() {};
	
}
