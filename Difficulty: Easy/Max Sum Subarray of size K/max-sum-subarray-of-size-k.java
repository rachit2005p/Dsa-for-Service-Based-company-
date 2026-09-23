class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		// Code here
		int sum = 0;
		for (int i = 0; i<k; i++) {
			sum += arr[i];
		} int maxx = sum;
		for (int i = 0; i<arr.length - k; i++) {
			sum = sum - arr[i];
			sum += arr[i + k];
			maxx=Math.max(sum, maxx);
		} return maxx;
	}
}
