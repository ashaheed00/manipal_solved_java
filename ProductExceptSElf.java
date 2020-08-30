package ok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	public int[] productExceptSelf(int[] nums) {

		// The length of the input array
		int length = nums.length;

		// The left and right arrays as described in the algorithm
		int[] L = new int[length];
		int[] R = new int[length];

		// Final answer array to be returned
		int[] answer = new int[length];

		// L[i] contains the product of all the elements to the left
		// Note: for the element at index '0', there are no elements to the left,
		// so L[0] would be 1
		L[0] = 1;
		for (int i = 1; i < length; i++) {

			// L[i - 1] already contains the product of elements to the left of 'i - 1'
			// Simply multiplying it with nums[i - 1] would give the product of all
			// elements to the left of index 'i'
			L[i] = nums[i - 1] * L[i - 1];
		}

		// R[i] contains the product of all the elements to the right
		// Note: for the element at index 'length - 1', there are no elements to the
		// right,
		// so the R[length - 1] would be 1
		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {

			// R[i + 1] already contains the product of elements to the right of 'i + 1'
			// Simply multiplying it with nums[i + 1] would give the product of all
			// elements to the right of index 'i'
			R[i] = nums[i + 1] * R[i + 1];
		}

		// Constructing the answer array
		for (int i = 0; i < length; i++) {
			// For the first element, R[i] would be product except self
			// For the last element of the array, product except self would be L[i]
			// Else, multiple product of all elements to the left and to the right
			answer[i] = L[i] * R[i];
		}

		return answer;
	}
}

public class ProductExceptSElf {
	public static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new int[0];
		}

		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

	public static String integerArrayToString(int[] nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			int number = nums[index];
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayToString(int[] nums) {
		return integerArrayToString(nums, nums.length);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int[] nums = stringToIntegerArray(line);
			int[] ret = new Solution().productExceptSelf(nums);
			String out = integerArrayToString(ret);

			System.out.print(out);
		}
	}
}
