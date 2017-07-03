public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int tag = -1;
        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicated = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicated = true;
                    break;
                }
            }
            if (isDuplicated) {
                tag = tag == -1 ? i : tag;
            } else {
                if (tag != -1) {
                    nums[tag] = nums[i];
                    tag++;
                }
            }
        }
        return tag == -1 ? nums.length : tag;
    }
}
