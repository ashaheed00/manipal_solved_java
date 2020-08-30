package ok;

import java.util.*;

public class MergeArLi {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		System.out.println(mergeAndSort(al1, al2));
	}

	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			int a = sc.nextInt();
			al1.add(a);
		}
		for (int i = 1; i <= 5; i++) {
			int b = sc.nextInt();
			al2.add(b);
		}
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		arrli.addAll(al1);
		arrli.addAll(al2);
		Collections.sort(arrli);
		ArrayList<Integer> alf = new ArrayList<Integer>(3);
		alf.add(arrli.get(2));
		alf.add(arrli.get(6));
		alf.add(arrli.get(8));

		return alf;
	}
}

