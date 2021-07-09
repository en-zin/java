package practice;

import java.util.Scanner;

public class calc {
	int toatal;
	String equal;
	Scanner in = new Scanner(System.in);
	
	public calc() {
		toatal = 0;
		equal = "";
	}
	
	public void action() {
		equal = in.nextLine();
		while(equal != "="){
			equal = in.nextLine();
			if(equal != "=") {
				add(in.nextInt());				
			}
		}
		toatal();
	}
	
	public void add(int number) {
		toatal = number + toatal;
	}
	
	public void toatal() {
		 System.out.println(toatal);
	}
}
