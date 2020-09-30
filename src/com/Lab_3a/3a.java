// ВАРИАНТ 23
package com.Lab_3a;

class Main {
    public static void main(String[] args) {
        int arr[] = new int[30];                  // создаем массив

        // инициализируем массив случайными числами [-500; 500]
        for(int i = 0; i < arr.length; i++)
            arr[i] = ((int)(Math.random() * 1001) - 500);
        int max = -2147000000;
        int maxIndex = 0;                         // индекс максимального элемента

        // находим максимальный элемент и его индекс
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int s1 = 0;
        int s2 = 0;

        // находим сумму положительных и отрицательных элементов
        // до и после максимального элемента соответственно
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 && i > maxIndex)
                s1+=arr[i];
            if(arr[i] < 0 && i < maxIndex)
                s2+=arr[i];
        }

        System.out.println("s1 = " + s1 + "\ns2 = " + s2);
    }
}
