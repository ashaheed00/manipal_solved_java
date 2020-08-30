package ok;

import java.util.*;

public class RollNoValid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		byte flag1 = 0;
		sc.close();
		if (s.length() == 4) {
			for (int i = 0; i < 4; i++) {
				if (s.charAt(i) < '0' || s.charAt(i) > '9') {
					flag1 = 1;
				}
			}
		} else {
			System.out.println("Roll number must have 8 digits");
			System.exit(0);
		}
		if (flag1 > 0) {
			System.out.println("Roll number should contain only digits");
		} else if (s.charAt(0) < '1' || s.charAt(0) > '2') {
			System.out.println("Roll number's first digit must be either 1 or 2");
		} else {
			System.out.println(s);
		}
	}
}
