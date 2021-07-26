package com.alpha.work1;



public class MyCalculate {
    public static double calcPi(int n) {
        double sum = 0.0;
        for (int i = n; i > 0; i--) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i == 1) {
                sum *= 4;
            }
        }
        return sum;
    }
}
