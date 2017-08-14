package com.company;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значения a,b,c");
        double a, b, c;
        double D;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        D = (Math.pow(b, 2)) - (4 * a * c);
        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 равен " + x1 + " ,x2 равен " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
        } else {
            System.out.println("Уравнение не имеет корня квадратного");
        }
    }
}


