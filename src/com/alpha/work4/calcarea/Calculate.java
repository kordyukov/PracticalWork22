package com.alpha.work4.calcarea;

public class Calculate {
    public static double PI = 3.1415D;

    public Calculate() {
    }

    public static double areaCircle(double r) {
        return PI * Math.pow(r, 2.0D);
    }

    public static double areaSquare(int s) {
        return Math.pow((double)s, 2.0D);
    }
}
