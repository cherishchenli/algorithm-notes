package sorting;

public class CountingSort {

	public static void sort(int[] nums, int k) {
		int n = nums.length;
		int[] aux = new int[n], count = new int[k + 1];

		for (int num : nums)
			count[num]++;

		for (int i = 1; i <= k; i++)
			count[i] += count[i - 1];

		for (int num : nums) {
			aux[count[num] - 1] = num;
			count[num]--;
		}

		for (int i = 0; i < n; i++)
			nums[i] = aux[i];
	}

}
