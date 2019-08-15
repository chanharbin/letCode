/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

public class Power {
    public double Power(double base, int exponent) {
        double res = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                res = res * base;
            }
            return res;
        } else {
            for (int i = 0; i > exponent; i--) {
                res = res / base;
            }
        }
        return res;
    }

}
