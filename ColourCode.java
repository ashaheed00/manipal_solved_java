package ok;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColourCode {
	public static void main(String[] args) {
		ColourCodeValidator code = new ColourCodeValidator();
		Integer n;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {
			String str = sc.next();
			System.out.println(code.validateHexCode(str));
		} else if (i == 2) {// System.out.println("//");
			String str = sc.next();
			System.out.println(code.validateDecimalCode(str));
		} else
			System.out.println("Invalid");
	}

	static class ColourCodeValidator {
		String hex;
		String deci;

		static boolean validateHexCode(String hex) {
			Boolean bl = Pattern.matches("#[A-F0-9]{6}", hex);
			return bl;
		}

		static boolean validateDecimalCode(String deci) {
			Boolean bn = Pattern.matches("rgb\\S([01]?\\d{1,2}|2[0-5][0-5]),([01]?\\d{1,2}|2[0-5][0-5]),([01]?\\d{1,2}|2[0-5][0-5])\\S", deci);
			return bn;
		}
	}
}
