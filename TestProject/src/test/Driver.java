package test;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner INPUT = new Scanner(System.in);
		InputNumbers data = new InputNumbers();
		Calculate cal = new Calculate();
		String op = "";
		
		
		System.out.println("Please enter the first number: ");
		data.setInpt1(INPUT.nextFloat());
		System.out.println("Please enter the second number: ");
		data.setInpt2(INPUT.nextFloat());
		System.out.println("Enter the opertaion [+, -, *, /]: ");
		op = INPUT.next();
		
		
		if (op.equals("+")) {
			System.out.println("Result: "+cal.add(data));
				
		} else if (op.equals("-")) {
			System.out.println("Result: "+cal.substract(data));
			
		}else if (op.equals("*")) {
			System.out.println("Result: "+cal.multiply(data));
			
		}else if (op.equals("/")) {
			System.out.println("Result: "+cal.divide(data));
			
		}else {
			System.out.println("Error: Invaild Input. ");
			
		}
		
		
		INPUT.close();
	}

}
