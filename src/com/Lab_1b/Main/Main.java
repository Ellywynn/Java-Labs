// ВАРИАНТ 24
package com.Lab_1b.Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String names[] = {"A", "B", "C", "D", "F", "G"};
        int size = names.length;
        int[][] points = new int[size][2];

        for(int i = 0; i < names.length; i++) {
            System.out.println("Введите координаты точки " + names[i] + ": ");
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }

        int AB = calculateLength(points[0][0], points[0][1]);
        int BC = calculateLength(points[1][0], points[1][1]);
        int CA = calculateLength(points[2][0], points[2][1]);

        int DF = calculateLength(points[3][0], points[3][1]);
        int FG = calculateLength(points[4][0], points[4][1]);
        int GD = calculateLength(points[5][0], points[5][1]);

        int ABC = AB + BC + CA;
        int DFG = DF + FG + GD;

        if(ABC > DFG){
            System.out.println("Площадь треугольника ABC больше.");
        }else{
            System.out.println("Площадь треугольника DFG больше.");
        }
    }

    private static int calculateLength(int x, int y){
        return Math.abs((int)(Math.sqrt((double)(x)/(double)(y))));
    }
}