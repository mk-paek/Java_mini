package test;

public class Student {
		public int sno;
		public String name;
	
		
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				return s.name.equals(name) && (s.sno == sno);
			} else {
				return false;
			}
		}
		
		public int hashCode() {
			return name.hashCode() + sno;
		}
}
