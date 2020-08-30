package ok;

import java.util.*;

public class MaxInt {
	public static int getMaxDigit(String nm) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int i = 0;
		if (nm == null) {
			return -1;
		} else {
			for (char ch : nm.toCharArray()) {
				if (ch >= '0' && ch <= '9') {
					ar.add(Integer.parseInt(String.valueOf(ch)));
					i++;
				}

			}
			Collections.sort(ar);
			if (i > 1) {
				return ar.get(i - 1);
			} else
				return -1;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(getMaxDigit(str));
	}
}
