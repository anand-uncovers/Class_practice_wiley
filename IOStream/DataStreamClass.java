package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args) throws IOException{
		//FileOutputStream fout = new FileOutputStream("C:\\Training\\Wiley\\JAVA\\day1_21_04_23\\wiley_core_java\\data22\\data122.txt");
		
		//DataOutputStream dos = new DataOutputStream(fout);
		
		//dos.writeBytes("I am a programmer");
		//dos.flush();
		//dos.close();
		
		FileInputStream fin = new FileInputStream("C:\\Training\\Wiley\\JAVA\\day1_21_04_23\\wiley_core_java\\data22\\data122.txt");
		
		    DataInputStream dis = new DataInputStream(fin);
			
			int count = fin.available();
			byte[]ba = new byte[count];
			
			dis.read(ba);
			
			for(byte b:ba)System.out.println((char)b);
			
			dis.close();
			fin.close();

		

	}

}
