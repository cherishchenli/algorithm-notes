package sorting;

import java.util.Random;

public class QuickSort {

	public void sort(int[] nums) {
		shuffle(nums);
		sort(nums, 0, nums.length - 1);
	}

	private void sort(int[] nums, int low, int high) {
		if (high <= low)
			return;
		int j = partition(nums, low, high);
		sort(nums, low, j - 1);
		sort(nums, j + 1, high);
	}

	private void shuffle(int[] nums) {
		Random random = new Random();
		for (int i = 1; i < nums.length; i++) {
			int r = random.nextInt(i + 1);
			Helper.swap(nums, i, r);
		}
	}

	private int partition(int[] nums, int low, int high) {
		int i = low, j = high + 1, v = nums[low];
		while (true) {
			while (nums[++i] < v)
				if (i == high)
					break;
			while (v < nums[--j])
				if (j == low)
					break;
			if (i >= j)
				break;
			Helper.swap(nums, i, j);
		}
		Helper.swap(nums, low, j);
		return j;
	}

}
