package mypackage;

public class Variables {
	public static void main (String[] args) {
		//Program About Variables
		
		//INT
		int age = 19;
		int year = 2026;
		int quantity = 1;
	
		System.out.println("Your age is: " + age);
		System.out.println("current year is: " + year);
		System.out.println("Number of quantity is: " + quantity);
		
		System.out.println();
		
		//DOUBLE 
		double cgpa = 9.10;
		double price =100.20;
		double temperature = -10.5;
		
		System.out.println("Your this year CGPA is: " + cgpa);
		System.out.println("price of the product you bought: " + price);
		System.out.println("temperature in your city: " + temperature);
		
		System.out.println();
		
		//CHAR
		char grade = 'A';
		char symbol ='!';
		char currency = '$';
		
		System.out.println("Your this year Grade for the subject math is: " + grade);
		System.out.println("symbol " + symbol);
		System.out.println("Currency used in America is: " + currency);
		
		System.out.println();
		
		
		//BOOLEAN
		boolean isStudent = true;
		boolean forSale = true;
		boolean isOnline = false;
		
		if(isStudent) {
			System.out.println("You are a Student 😊");
		}
		else {
			System.out.println("You are not a Student 😒");
		}
		
		System.out.println();
		
		//STRING
		String name = "Unknown";
		String food = "pizza!";
		String email = "unknown123@gmail.com";
		String car = "BMW";
 		String color = "Golden";
		
		System.out.println("Your name is " + name);
		System.out.println("Your fav food is " + food);
		System.out.println("Your email is " + email);
		System.out.println("Your fav car is " + car);
		System.out.println("Your fav color is " + color);
		
		System.out.println();
		
		//Final print statements
		System.out.println("Hii" + symbol + " My name is " + name + 
                " and I am " + age + " years old.\n" +
                "My current year CGPA is: " + cgpa);

		
	}

}
