package test;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);
		os.flush();
		os.close();
	}

}
