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
		i=10;
		i=200;
		i=3000;
		i=40000;
		i=500000;
		PrintSomething("Hello World !!! "+i);
		PrintSomething("Hello again");
	}
	
	static void NewLine() {
		System.out.println();
	}

}
