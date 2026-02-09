package mypackage;

import java.util.Scanner;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		for (int i =1 ; i <= 3; i++) {
		
			for(int j = 1 ; j <= 9 ; j++) {
			
			System.out.print(j + " ");
			}
			
			System.out.println();
		} 
		
		Scanner scanner = new Scanner(System.in);
		
		
		int rows;
		int columns;
		char symbol;
		
		
		System.out.print( "Enter the Number of Rows: ");
		rows = scanner.nextInt();
		
		System.out.print( "Enter the Number of Columns: ");
		columns = scanner.nextInt();
		
		System.out.print( "Enter the Symbol to use ");
		symbol = scanner.next().charAt(0);
		
		for (int i = 0 ; i <  rows ; i++) {
			for ( int j = 0 ; j < columns ; j++) {
				System.out.print(symbol);
			}
			
			System.out.println();

		}
		
	
		
		scanner.close();
		
	}

}
