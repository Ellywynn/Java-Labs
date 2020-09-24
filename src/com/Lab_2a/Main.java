// ВАРИАНТ 24
package com.Lab_2a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        System.out.println(foo(a));
    }

    private static double foo(double a){
        double result = 1d;

        if(a<-1 || a>1){
            result = 1d;
        }else if(a>-1 && a<0){
            result = 1d + a;
        }else{
            result = 2d;
        }

        return result;
    }
}
