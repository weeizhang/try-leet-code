public class TwoSumInArray167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target) {
                return new int[]{0, 0};
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] > target) {
                    break;
                }
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{0, 0};
    }
}
