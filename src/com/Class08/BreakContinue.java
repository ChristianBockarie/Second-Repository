package com.Class08;

public class BreakContinue {

	public static void main(String[] args) {
		
		//BREAK
		for (int i=1; i<=5; i++) {
			if (i==5) {
				break;
			}System.out.println("Hello");//break exits as soon as the condition is met
		}
		
		
		//CONTINUE
		for (int i=0; i<5; i++) {
			
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
