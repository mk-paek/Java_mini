package exam;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Temp/forest.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("보조스트림을 사용하지 않았을 떄: " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:/Temp/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(fis2.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("보조스트림을 사용했을 떄: " + (end - start) + "ms");
		bis.close();
		fis2.close();
		
		}
}
