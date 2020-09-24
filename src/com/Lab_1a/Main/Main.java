// ВАРИАНТ 4
package com.Lab_1a.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        int numbers[] = new int[size];
        System.out.printf("Введите %d чисел: ", size);
        System.out.println();
        for(int i = 0; i < size; i++){
            numbers[i] = input.nextInt();
        }

        int i = 0;
        while(i<size){
            double a = Math.sin(2*numbers[i]) + Math.sin(numbers[i]*5) - Math.sin(numbers[i]*3);
            double b = Math.cos(numbers[i]) - Math.cos(numbers[i]*3) + Math.cos(numbers[i]*5);
            double z1 = a/b;
            double z2 = Math.sin(numbers[i]*3)/Math.cos(numbers[i]*3);

            System.out.printf("z1 = %f; z2 = %f\n", z1, z2);
            i++;
        }
    }
}