package test;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		//int readByte;
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
		while(true) {
			//readByte = is.read();
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			
			data += new String(readBytes, 0, readByteNo);
			
			//System.out.println((char)readByte);
		}
		System.out.println(data);
		is.close();
	}

}