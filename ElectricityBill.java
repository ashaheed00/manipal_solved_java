package ok;

import java.util.Scanner;

public class ElectricityBill {
	public static void bill(int units) {
		double b = 0;
		if(units<0) {
			System.out.println("Invalid Units. Please put a positive number.");
		} else if(units<=30) {
			b = 3.5*units;
		}else if(units<=100) {
			b = 3.5*30 + (units-30)*4;
		}else {
			b = 3.5*30 + 70*4 + (units-100)*5;
		}
	System.out.println("Your Bill: Rs." + b);;	
	}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Units: ");
	int u = sc.nextInt();
	bill(u);
	sc.close();
}
}
