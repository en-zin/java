package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
	int toatal;
	Scanner in = new Scanner(System.in);
	
	public calc() {
		toatal = 0;
	}
	
	public void action() {
		try{
			while(true){
				add(in.nextInt());			
			}			
		} catch (InputMismatchException e) {
			toatal();
        }
	}
	public void add(int number) {
		toatal = number + toatal;
	}
	
	public void toatal() {
		 System.out.println(toatal);
	}
}
