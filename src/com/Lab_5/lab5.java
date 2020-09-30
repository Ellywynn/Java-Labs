// ВАРИАНТ 3
package com.Lab_5;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число килограмм: ");
        double kilos = input.nextDouble();
        int choice = -1;
        System.out.printf("Во что конвертировать?\n");
        System.out.printf("1 - в фунты\n");
        System.out.printf("2 - в кэтти\n");
        System.out.printf("3 - в унции\n");
        System.out.printf("Ваш выбор: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(kilos + " килограмм = " + KiloConverter.toPounds(kilos) + " фунтов.");
                break;
            case 2:
                System.out.println(kilos + " килограмм = " + KiloConverter.toCatty(kilos) + " кэтти.");
                break;
            case 3:
                System.out.println(kilos + " килограмм = " + KiloConverter.toOunces(kilos) + " унций.");
                break;
            default:
                System.out.println("Вы не сделали выбор.");
                break;
        }
    }
}
