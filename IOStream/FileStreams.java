package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreams {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fout = new FileOutputStream("I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\data4.txt");
//		
//		String str = "Wiley fullstack project";
//		
//		byte[] b = str.getBytes();
//		
//		fout.write(b);
//		
//		fout.flush();
//		fout.close();
		
		FileInputStream fin = new FileInputStream("C:\\\\Training\\\\Wiley\\\\JAVA\\\\day1_21_04_23\\\\wiley_core_java\\\\data22\\\\data122.txt");
		
		int i = 0;
		
		while((i = fin.read())!=-1) {
			System.out.println((char)i);
		}
		fin.close();
	}
}
