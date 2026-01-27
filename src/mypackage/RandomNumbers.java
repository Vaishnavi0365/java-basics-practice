package mypackage;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		/*
		int number;
		
		number = random.nextInt(1, 7);
		
		System.out.println(number);
		*/
		
		boolean isHeads;
		
		isHeads = random.nextBoolean();
		
		if(isHeads) {
			
			System.out.println("Heads");
		}
		else {
			System.out.println("Tails");
		}
	}

}
