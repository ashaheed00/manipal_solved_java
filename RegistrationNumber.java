package ok;


import java.util.Scanner;
import java.util.regex.Pattern;

public class RegistrationNumber {
	public static int checkRegistrationNumber(String reg) throws StringIndexOutOfBoundsException {
		int sum = 0;
		if (reg == null||reg.length()<9) {
			return -1;
		} else {
			Boolean bn = Pattern.matches("[KD][AL](0\\d|10)[A-Z]{1,2}([1-9]\\d\\d\\d)", reg);
			int n = reg.length();
			sum = Integer.parseInt(String.valueOf(reg.charAt(n - 1)))
					+ Integer.parseInt(String.valueOf(reg.charAt(n - 2)))
					+ Integer.parseInt(String.valueOf(reg.charAt(n - 3)))
					+ Integer.parseInt(String.valueOf(reg.charAt(n - 4)));

			if (bn && (sum == 6 || sum == 15 || sum == 24 || sum == 33))
				return 1;
			else if (bn)
				return 0;
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reg = sc.next();
		sc.close();
		if (checkRegistrationNumber(reg) == 0)
			System.out.println("Valid registration number");
		if (checkRegistrationNumber(reg) == -1)
			System.out.println("Invalid registration number");
		if (checkRegistrationNumber(reg) == 1)
			System.out.println("Lucky registration number");
	}
}
