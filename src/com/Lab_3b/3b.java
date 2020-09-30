// ВАРИАНТ 3
package com.Lab_3b;

class Main {
    public static void main(String[] args) {
        int cols = 5;
        int rows = 10;
        int zeroCols = 0;
        int matrix[][] = new int[rows][cols];

        // инициализируем матрицу случайными числами [-50;50]
        for(int i=0; i<rows; i++){
            System.out.printf("Line #%d:\t",i+1);
            for(int j=0; j<cols; j++) {
                matrix[i][j] = ((int) (Math.random() * 101) - 50); // [-50;50]
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }

        // находим количество строк, содержащих 0
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    zeroCols++;
                    break;
                }
            }
        }

        System.out.printf("zeroCols: %d\n", zeroCols);

        // находим самую длинную последовательность одинаковых чисел
        int line = 0;
        int prevLineCounter = 0;
        int lineCounter = 0;
        for(int i = 0; i<rows; i++){
            for(int j=1; j<cols-1; j++){
                if(matrix[i][j] == matrix[i][j-1]){
                    lineCounter++;
                    if(prevLineCounter < lineCounter){
                        prevLineCounter = lineCounter;
                        line = i;
                    }
                }
            }
        }

        System.out.printf("Line: %d", line);
    }
}
