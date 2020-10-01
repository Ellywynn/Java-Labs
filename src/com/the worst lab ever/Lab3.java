package com.Lab;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер матрицы: ");
        int size = input.nextInt();

        int matrix[][] = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j] = (int)(Math.random() * 10);

                if(i==j) {
                    System.out.printf("\\ ");
                }else if(i==size-1-j){
                    System.out.printf("/ ");
                }else {
                    System.out.printf("%d ", matrix[i][j]);
                }

            }
            System.out.printf("\n");
        }

        if(size%2!=0){
            int j = size/2;
            for(int i = 0; i < size/2; i++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][size-i-1];
                matrix[j][size-i-1] = temp;
            }
        }

        for(int i=0; i<size/2; i++){
            for(int j=0; j<size; j++){
                if(i == j || i == size-j-1){
                    continue;
                }
                else{
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[size - i - 1][size - j - 1];
                        matrix[size - i - 1][size - j - 1] = temp;
                }
            }
        }

        System.out.println("\nПосле отражения:\n");

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j) {
                    System.out.printf("\\ ");
                }else if(i==size-1-j){
                    System.out.printf("/ ");
                }else {
                    System.out.printf("%d ", matrix[i][j]);
                }
            }
            System.out.printf("\n");
        }
    }
}