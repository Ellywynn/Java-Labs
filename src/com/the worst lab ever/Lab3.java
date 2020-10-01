package com.Lab;

import java.util.Scanner;

public class Lab3 {
    static void printMatrix(int m[][]){
        int size = m.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i == size/2 && j == size/2){
                    System.out.printf("X ");
                }
                else if(i==j) {
                    System.out.printf("\\ ");
                }else if(i==size-1-j){
                    System.out.printf("/ ");
                }else {
                    System.out.printf("%d ", m[i][j]);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер матрицы: ");
        // ввод размера матрицы
        int size = input.nextInt();

        // создание матрицы, инициализация случайными числами [0;9]
        int matrix[][] = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        printMatrix(matrix);

        // перестановка центральных элементов по горизонтальной оси, если размер матрицы нечетный
        if(size%2!=0){
            int j = size/2;
            for(int i = 0; i < size/2; i++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][size-i-1];
                matrix[j][size-i-1] = temp;
            }
        }

        // перестановка элементов матрицы
        for(int i=0; i<size/2; i++){
            for(int j=0; j<size; j++){
                // если элемент принадлежит главной или обратной диагоналям - скип
                if(i == j || i == size-j-1){
                    continue;
                }
                else{
                    // заменяем элементы крест накрест
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[size - i - 1][size - j - 1];
                    matrix[size - i - 1][size - j - 1] = temp;
                }
            }
        }

        System.out.println("\nПосле отражения:\n");

        printMatrix(matrix);
    }
}