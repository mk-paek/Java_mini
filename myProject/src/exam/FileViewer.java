package exam;

import java.io.FileInputStream;

public class FileViewer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(args[0]);
		
		int data = 0;
		while((data = fis.read()) != -1 ) {
			char c = (char)data;
			System.out.println(c);
			
		}
	}

}
