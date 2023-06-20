package test;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriteEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		String data = "안녕하세요?";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
		}
}
