/**
 * 解法：摩尔投票法 Moore Voting
 */
public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int result = nums[0];
        int vote = 0;
        for (int i = 0;i< nums.length;i++) {
            if (nums[i] == result) {
                vote++;
            } else {
                vote--;
            }
            if (vote == 0) {
                result = nums[i+1];
                vote = 0;
            }
        }

        return result;
    }

}
