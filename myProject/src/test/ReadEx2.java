package test;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
	}

}
