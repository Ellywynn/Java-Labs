// ВАРИАНТ 24
package com.Lab_2b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        int nch = 0, ch = 0;
        int tries = 0;

        while(true){
            if(n % 2 != 0 && foo(n) == 1){
                nch = n;
                break;
            }
            n++;
        }
        n = 1;
        while(true){
            if(n % 2 == 0 && foo(n) == 1){
                if(tries == 1){
                    ch = n;
                    break;
                }else{
                    tries++;
                }
            }
            n++;
        }

        System.out.println("Первое нечетное избыточное число: " + nch);
        System.out.println("Второе четное избыточное число: " + ch);

    }

    private static int foo(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        if(sum > n){
            return 1;
        }else{
            return 0;
        }
    }
}
