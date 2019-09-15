package sorting;

public class MergeSort {

	private int[] aux;

	public void sort(int[] nums) {
		aux = new int[nums.length];
		sort(nums, 0, nums.length - 1);
	}

	private void sort(int[] nums, int low, int high) {
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(nums, low, mid);
		sort(nums, mid + 1, high);
		merge(nums, low, mid, high);
	}

	private void merge(int[] nums, int low, int mid, int high) {
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++)
			aux[k] = nums[k];
		for (int k = low; k <= high; k++) {
			if (i > mid)
				nums[k] = aux[j++];
			else if (j > high)
				nums[k] = aux[i++];
			else if (aux[j] < aux[i])
				nums[k] = aux[j++];
			else
				nums[k] = aux[i++];
		}
	}
}
