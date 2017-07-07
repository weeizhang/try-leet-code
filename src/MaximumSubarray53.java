public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (temp > sum) {
                    sum = temp;
                }
            }
            maxSum = sum > maxSum ? sum : maxSum;
        }
        return maxSum;
    }
}
