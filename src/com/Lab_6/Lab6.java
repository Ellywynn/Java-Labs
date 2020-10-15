//ВАРИАНТ 3
package com;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String output = "";
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            counter++;
            output += str.charAt(i);
            if(counter == 3){
                output += " ";
                counter = 0;
            }
        }

        System.out.println(output);
    }
}
