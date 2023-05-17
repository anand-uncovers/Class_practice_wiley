package IOStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOStream {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fout = new FileOutputStream("C:\\Training\\Wiley\\JAVA\\day1_21_04_23\\wiley_core_java\\data22\\data121.txt");
    // BufferedOutputStream bof = new BufferedOutputStream(fout);
    //  String str =" I am a programmer";
      
    //  byte[]b = str.getBytes();
    //  
    //  try {
    //	  bof.write(b);
    //	  bof.flush();
    //	  bof.close();
     // }catch(IOException e) {
    //	  e.printStackTrace();
     // }
		FileInputStream fin = new FileInputStream("C:\\Training\\Wiley\\JAVA\\day1_21_04_23\\wiley_core_java\\data22\\data121.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		
		//try {
		 //   	  bis.write(bis);
		//    	  bis.flush();
		  //  	  bis.close();
		   //   }catch(IOException e) {
		   //   e.printStackTrace();
		    // }
		int i;
		while((i=bis.read())!=-1) {
		System.out.println((char)i);
	}
	bis.close();
		fin.close();
	}

}
