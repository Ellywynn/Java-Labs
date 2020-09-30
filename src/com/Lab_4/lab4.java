package com.Lab_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Введите размер матрицы: ");
        int size = 0;
        try {
            size = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Вы ввели не число.");
        }
        int max = -2147000000;
        int matrix[][] = new int[size][size];
        int oddCount = 0;

        try {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("Введите элемент [" + i + "][" + j + "]: ");
                    matrix[i][j] = input.nextInt();
                    if (matrix[i][j] % 2 == 0 && i == j) {
                        oddCount++;
                        if (matrix[i][j] > max) {
                            max = matrix[i][j];
                        }
                    }
                }
            }
            if(oddCount == 0){
                System.out.println("На главной диагонали нет четных чисел.");
            }
            else{
                System.out.println("Максимальный четный элемент на главной диагонали: " + max);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Вы ввели не число.");
        }
    }
}
