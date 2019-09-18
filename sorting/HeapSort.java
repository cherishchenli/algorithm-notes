package sorting;

public class HeapSort {
	
	public static void sort(int[] nums) {
		int n = nums.length;
		for (int k = n / 2; k >= 1; k--)
			sink(nums, k, n);
		while (n > 1) {
			Helper.swap(nums, 1, n--);
			sink(nums, 1, n);
		}
	}

	private static void sink(int[] nums, int k, int n) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && nums[j] < nums[j + 1])
				j++;
			if (nums[k] >= nums[j])
				break;
			Helper.swap(nums, k, j);
			k = j;
		}
	}
	
}
