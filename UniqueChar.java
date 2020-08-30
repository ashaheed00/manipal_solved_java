package ok;

import java.util.Scanner;

public class UniqueChar {
	public static int getUcc(String s) {
		int n = 0;
		s = s.trim();
		s = s.replaceAll("\\s", "");
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb.length());
		int l = sb.length();
		for (int i = 0; i < l; i++) {
			n = 0;
			for (int j = i + 1; j < l; j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					n++;
					j--;
					l--;
				}
			}
			if (n > 0) {
				sb.deleteCharAt(i);
				i--;
				l--;
			}
		}
		if (sb.length() == 0)
			return -1;
		else
			return sb.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(getUcc(str));
	}
}
