package exam;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String fileName = "User.info";
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		User u1 = (User)in.readObject();
		User u2 = (User)in.readObject();
		ArrayList<User> list = (ArrayList)in.readObject();
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
