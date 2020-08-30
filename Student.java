package ok;

import java.util.*;

public class Student {
	public static void main(String[] args) {
		// write code here
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		if (type.equals("Student")) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			String college = sc.nextLine();
			System.out.println("Student ID: " + id);
			System.out.println("Student Name: " + name);
			System.out.println("College: " + college);
		} else if (type.equals("EngineeringStudent")) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			String college = sc.nextLine();
			System.out.println("Student ID: " + id);
			System.out.println("Student Name: " + name);
			System.out.println("College: " + college);
			String stream = sc.nextLine();
			System.out.println("Stream: " + stream);
		} else {
			System.out.println("Invalid");
		}
	}
}
