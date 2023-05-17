package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterStreamClass {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("C:\\\\Training\\\\Wiley\\\\JAVA\\\\day1_21_04_23\\\\wiley_core_java\\\\data22\\\\data122.txt);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I like programming, what to do");
		
		bw.flush();
		bw.close();
		fw.close();
		
	}
}