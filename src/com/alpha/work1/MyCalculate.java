package com.alpha.work1;

import java.math.BigDecimal;

public class MyCalculate {
    public static double calcPi(int n){
        double sum = 0;
        for (int i=1; i<n; i++) {
            double element = Math.pow(-1,i+1) / (2*i + 1); //element i
            sum += element; // add element i to the results so far
        }
        return  4*sum;

    }
}
