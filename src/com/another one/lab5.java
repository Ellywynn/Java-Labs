package com;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class lab5 {
    public static void main(String[] args) {
        task2();
    }
    public static void task1(){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 + 1);
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\n");
        int index = 0;
        int min = 101;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min && array[i] % 2 == 0){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Индекс минимального четного элемента " + min + " равен " + index);

        ArrayList<Integer> elements = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(array[i] % min == 0){
                elements.add(array[i]);
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public static void task2(){
        final int SIZE = 20;
        ArrayList<Integer> array = new ArrayList<Integer>(SIZE);
        System.out.printf("Начальный список:\n");
        for(int i = 0; i < SIZE; i++){
            array.add((int)(Math.random() * 10.f + 1.f));
            System.out.printf("%d ", array.get(i));
        }

        System.out.printf("\n");

        ArrayList<Integer> unrepeatedElements = new ArrayList<Integer>();
        for(int i = 0; i < SIZE; i++){
            if(unrepeatedElements.indexOf(array.get(i)) == -1){
                unrepeatedElements.add(array.get(i));
            }
        }
        System.out.printf("Конечный список:\n");
        for(int i = 0; i < unrepeatedElements.size(); i++){
            System.out.printf("%d ", unrepeatedElements.get(i));
        }
    }
}