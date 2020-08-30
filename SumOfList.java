package ok;

import java.util.*;

public class SumOfList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();

		if ((s1 == null || s1.isEmpty()) && (s2 == null || s2.isEmpty())) {
			System.out.println(l2);
		} else if (s1 == null || s1.isEmpty()) {
			for (String str : s2.split(", +")) {
				l2.add(Integer.parseInt(str));
			}
			System.out.println(l2);
		} else if (s2 == null || s2.isEmpty()) {
			for (String str : s1.split(", +")) {
				l1.add(Integer.parseInt(str));
			}
			System.out.println(l1);
		} else {
			for (String str : s1.split(", +")) {
				l1.add(Integer.parseInt(str));
			}
			for (String str : s2.split(", +")) {
				l2.add(Integer.parseInt(str));
			}
			System.out.println(getSumOfListElements(l1, l2));
		}
	}

	public static List<Integer> getSumOfListElements(List<Integer> first, List<Integer> second) {
		List<Integer> sum = new ArrayList<Integer>();
		if (first.size() > second.size()) {
			for (int i = 0; i < second.size(); i++) {
				sum.add(first.get(i) + second.get(i));
			}
			for (int i = 0; i < first.size() - second.size(); i++) {
				sum.add(first.get(i + second.size()));
			}
		} else {
			for (int i = 0; i < first.size(); i++) {
				sum.add(first.get(i) + second.get(i));
			}
			for (int i = 0; i < second.size() - first.size(); i++) {
				sum.add(second.get(i + first.size()));
			}
		}
		return sum;
	}
}


