package sorting;

public class BubbleSort {

	public void sort(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++)
				if (nums[j + 1] < nums[j])
					Helper.swap(nums, j, j + 1);
		}
	}

}
