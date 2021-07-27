package com.alpha.work4;

//import com.alpha.work4.calcarea.Calculate;


import com.alpha.work4.calcarea.Calculate;

import java.util.Scanner;


public class Runner {
    public void run(){

        System.out.println("Введите радиус окружности: ");
        System.out.println("Площадь окружности равна: "+ Calculate.areaCircle(this.inputRadius()));
        System.out.println("Введите cторону квадрата: ");
        System.out.println("Площадь квадрата равна: "+ Calculate.areaSquare(this.inputSide()));


    }

    public double inputRadius() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (sc.hasNextDouble()) {
                double r = sc.nextDouble();
                if (r > 0) return r;
            } else {
                sc.next();
            }
            System.out.println("Ошибка введении значения! Введите целое число или с запятой!");
        }
    }
    public int inputSide() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (sc.hasNextInt()) {
                int s = sc.nextInt();
                if (s > 0) return s;
            } else {
                sc.next();
            }
            System.out.println("Ошибка введении значения! Введите число!");
        }
    }
}
