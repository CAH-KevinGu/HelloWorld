package com.kevingu.home;

public class HelloWorld {

	/**
	 * @param args
	 */
	static void PrintSomething(String str) {
		System.out.print(str);
		NewLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		i=1;
		i=2;
		i=3;
		i=4;
		i=50;
		PrintSomething("Hello World !!! "+i);
		PrintSomething("Hello again");
	}
	
	static void NewLine() {
		System.out.println();
	}

}
