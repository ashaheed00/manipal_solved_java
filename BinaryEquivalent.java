package ok;

import java.util.*;

public class BinaryEquivalent {

	public static int[] binary(int n) {
		int i = 0;
		int one = 0;
		int zero = 0;
		int[] zo = new int[2];
		int bin[] = new int[n];
		for (i = 0; n > 0; i++) {
			int b = n % 2;
			n = n / 2;
			bin[i] = b;
			if (b == 1)
				one++;
			if (b == 0)
				zero++;
		}
		zo[0] = zero;
		zo[1] = one;
		return zo;
	}

	public static List<List<Integer>> getAllCombinations(List<Integer> elements) {
		List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
		for (long i = 1; i < Math.pow(2, elements.size()); i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < elements.size(); j++) {
				if ((i & (long) Math.pow(2, j)) > 0) {
					list.add(elements.get(j));
				}
			}
			combinationList.add(list);
		}
		return combinationList;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			num.add(sc.nextInt());
		}
		Collections.sort(num);
		int[] zob = binary(num.get(n - 1));
		int bits = zob[0] + zob[1];
		System.out.println(bits);
		int zeroSum = 0;
		int oneSum = 0;
		int counter = 0;
		int zero = 0;
		List<List<Integer>> list = getAllCombinations(num);
		for (List<Integer> set : list) {
			int i = 0;
			oneSum = 0;
			zeroSum = 0;
			for (int element : set) {
				int[] zo = binary(element);
				oneSum = oneSum + zo[1];
				zero = bits - zo[1];
				zeroSum = zeroSum + zero;
				System.out.print(element + " " + oneSum + zeroSum + "||");
				i++;
			}
			System.out.println();
			if (oneSum == zeroSum) {
				System.out.println("yes");
				counter++;
			}
		}
		System.out.println("counter: " + counter);
		int bin[] = new int[bits];
		for (int i = 0; counter > 0; i++) {
			int b = counter % 2;
			counter = counter / 2;
			bin[i] = b;
		}
		for (int j = bin.length - 1; j >= 0; j--)
			System.out.print(bin[j]);
		for (int k = 0; k < bits - bin.length; k++)
			System.out.print("0");

	}

}
