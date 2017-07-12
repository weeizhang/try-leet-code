public class Sqrt69 {
    public int mySqrt(int x) {
        double predict = 1.0;
        for (int i = 1; i <= 1000; i++) {  // recursion times : 1000
            predict = (predict + x / predict) / 2;
        }
        return (int) predict;
    }
}
