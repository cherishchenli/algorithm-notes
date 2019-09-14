package sorting;

public class InsertionSort {

	public void sort(int[] nums) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--)
				Helper.swap(nums, j, j - 1);
		}
	}

}
