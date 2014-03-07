package com.kevingu.home;

public class HelloWorld {

	/**
	 * @param args
	 */
	static void PrintSomething(String str) {
		NewLine();
		System.out.print(str);
		NewLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		i=10;
		i=200;
		i=3000;
		i=40000;
<<<<<<< HEAD
		i=500002; // note here 123
		i=6000003;
=======
		i=500002; // note here 123 abcdefg
>>>>>>> Test_Stash_01
		PrintSomething("Hello World !!! "+i);
		PrintSomething("Hello again");
	}
	
	static void NewLine() {
		System.out.println();
	}

}
