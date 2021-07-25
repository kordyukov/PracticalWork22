package com.alpha.work1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        double pi;

        System.out.println("Введмите значение ряда n:");

            pi = MyCalculate.calcPi(scanner.nextInt());

        System.out.println(pi);

    }
}
