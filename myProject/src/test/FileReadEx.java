package test;

import java.io.FileReader;
import java.io.Reader;

public class FileReadEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf, 1, 2);
		
		for(int i = 0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}

}
