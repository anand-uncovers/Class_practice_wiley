package demo_protected;

import basics_java_02.Atest;

public class Demo1 extends Atest {

	public static void main(String[] args) {
		Atest atc = new Atest();
		Demo1 dc = new Demo1();
	
		//name2 is in another package so not available
		//name3 is not child class so not name3
	}

}