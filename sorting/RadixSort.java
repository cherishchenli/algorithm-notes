package sorting;

public class RadixSort {

	public static void sort(int[] nums) {
		int max = nums[0];
		for (int num : nums)
			max = Math.max(num, max);
		for (int exp = 1; max / exp > 0; exp *= 10)
			CountingSort.sort(nums, exp);
	}

}
