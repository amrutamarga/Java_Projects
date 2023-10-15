/*
 * Let's create a Calculator Application using Switch.
 * 
 * Overview:
 * 
 * Application features a simple calculator that can perform the basic operations.
 * 
 * Provide a simple menu for the user to perform the desired arithmetic operation.
 * 
 */

package com.gqt.CalculatorApp.project;

import java.util.Scanner;

public class CalculatorApplication {

	public static int num_1;
	public static int num_2;
	
	public static void collectInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num_1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num_2 = sc.nextInt();
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t \t WELCOME TO CALCULATOR");
		System.out.println();

		System.out.println("Please select the operation to be performed:\n"
				+ "1. Addition Operation\n"
				+ "2. Subtraction Operation\n"
				+ "3. Multiplication Operation\n"
				+ "4. Division Operation\n"
				+ "5. Modulus Operation\n"
				+ "6. Exit\n"
				+ "7. Reset\n");

		int choice = sc.nextInt();
		switch(choice) {
			case 1: {
				System.out.println("Addition Operation\n");
				collectInput();
				System.out.println("The result of Addition is: "+(num_1+num_2));
				break;
			}
	
			case 2: {
				System.out.println("Subtraction Operation\n");
				collectInput();
				System.out.println("The result of Subtraction is: "+(num_1-num_2));
				break;
			}
	
			case 3: {
				System.out.println("Multiplication Operation\n");
				collectInput();
				System.out.println("The result of Multiplication is: "+(num_1*num_2));
				break;
			}
	
			case 4: {
				System.out.println("Division Operation\n");
				collectInput();
				System.out.println("The result of Division is: "+(num_1/num_2));
				break;
			}
	
			case 5: {
				System.out.println("Modulus Operation\n");
				collectInput();
				System.out.println("The result of Modulus is: "+(num_1%num_2));
				break;
			}
	
			case 6: {
				System.out.println("Thank you");
				System.exit(0);
			}
	
			case 7:{
				System.out.println("==================================================");
				main(null);
			}
	
			default:
				System.out.println("This is not a valid input please try again...");
				System.out.println();
				System.out.println("==================================================");
				main(null);
		}
		
		System.out.println("==================================================");
		main(null);
	}
}
