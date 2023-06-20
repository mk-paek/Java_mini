package exam;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "User.info";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			User u1 = new User("김정후", "1234", 23);
			User u2 = new User("이재용", "1111", 23);		
			
			ArrayList<User> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 끝났습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
