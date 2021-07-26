package com.alpha.work1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {
    public void run()
    {
        System.out.println("Введмите значение ряда n:");
        System.out.println(MyCalculate.calcPi(inputNumber()));
    }

    public int inputNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > 0) return number;
            } else {
                sc.next();
            }
            System.out.println("Error enter number. Repeat!!!");
        }
    }

    }


