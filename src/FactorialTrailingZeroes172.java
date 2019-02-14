/**
 * n!末尾有多少个0
 * 思路：
 * 0是2和5相乘得到的，而在1到n这个范围内，2的个数要远多于5的个数，所以这里只需计算从1到n这个范围内有多少个5就可以了。
 * 计算n/5, n/5/5, n/5/5/5, n/5/5/5/5, ..., n/5/5/5,,,/5直到商为0，然后再和，就是最后的结果。
 */
public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
        return n / 5 == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
