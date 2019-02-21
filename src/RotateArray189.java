public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        int[] copyNums = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % copyNums.length] = copyNums[i];
        }
    }
}
