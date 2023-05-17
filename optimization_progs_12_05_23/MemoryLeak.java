package optimization_progs_12_05_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Try with resources is a Java 7 feature, that  can automatically close the resources suvh as streams
	//and files, when they are no longer needed
	//This can prevent memory leaks and improve performance
	public class MemoryLeak {
	public static void main(String[] args) {
		//Inefficient way without try with resources
	//	FileInputStream fis = null;
		
		//try {
			//fis=new FileInputStream("myFile.txt");
			//stream statements goes here
		//}catch(FileNotFoundException e) {
		//	e.printStackTrace();
			//}
	//	}finally {
		//	if(fis!=null) {
			//	try {
				//	fis.close();
			//	}catch(IOException e2) {
				//	e2.printStackTrace();
				//}
			//}
	//	}
		
		
		//Efficient way of  using try with resources
		try(FileInputStream fis = new FileInputStream("myFile.txt")){
			//write your logic
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e1) {
			e1.printStackTrace();
		}

	}
	}
	

}
