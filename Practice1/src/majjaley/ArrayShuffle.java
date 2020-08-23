package majjaley;

import java.util.Arrays;

public class ArrayShuffle {

	public int[] shuffle(int[] nums, int n) {
		int[] extract = new int[2 * n];
		int k = 1;
		for (int i = n; i < (2 * n); i++) {
			extract[k] = nums[i];
			k += 2;

		}

		int l = 0;
		for (int i = 0; i < n; i++) {
			extract[l] = nums[i];
			l += 2;

		}
		return extract;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int n = 3;
		ArrayShuffle a = new ArrayShuffle();
		System.out.println(Arrays.toString(a.shuffle(nums, n)));
	}

}
