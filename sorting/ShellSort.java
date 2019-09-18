package sorting;

public class ShellSort {

	public static void sort(int[] nums) {
		int n = nums.length, h = 1;
		while (h < n / 3)
			h = 3 * h + 1;
		while (h >= 1) {
			for (int i = h; i < n; i++)
				for (int j = i; j >= h && nums[j] < nums[j - h]; j -= h)
					Helper.swap(nums, j, j - h);
			h = h / 3;
		}
	}

}
