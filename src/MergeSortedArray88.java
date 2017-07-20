public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int index1 = 0;
        int temp = nums1[0];
        while (index1 < m) {
            if (nums2[0] < temp) {
                nums1[index1] = nums2[0];
                insertNum(temp, nums2);
            }
            index1++;
            temp = nums1[index1];
        }
        if (index1 < m + n) {
            for (int i = 0; i < n; i++, index1++) {
                nums1[index1] = nums2[i];
            }
        }
    }

    private void insertNum(int temp, int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (temp < nums[i]) {
                nums[i - 1] = temp;
                return;
            } else {
                nums[i - 1] = nums[i];
            }
        }
        nums[nums.length - 1] = temp;
    }
}
