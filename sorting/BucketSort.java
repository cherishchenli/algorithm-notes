package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

	public static void sort(int[] nums) {
		int n = nums.length, max = nums[0];
		for (int num : nums)
			max = Math.max(max, num);

		int bucketSize = max / n + 1;
		List<Integer>[] buckets = new List[bucketSize];

		for (int i = 0; i < bucketSize; i++)
			buckets[i] = new ArrayList<>();

		for (int num : nums) {
			int i = num / n;
			buckets[i].add(num);
		}

		for (int i = 0; i < bucketSize; i++)
			Collections.sort(buckets[i]);

		for (int i = 0, j = 0; i < bucketSize; i++) {
			for (int num : buckets[i])
				nums[j++] = num;
		}
	}

}
