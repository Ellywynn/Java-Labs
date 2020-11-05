package com;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        task2();
    }

    static void task1(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = input.nextInt();
        String output = "";
        int hundrets, tens, ones;
        if(number>=100 && number<=999){
            hundrets = Math.floorDiv(number, 100);
            switch (hundrets){
                case 1:
                    output+="Сто "; break;
                case 2:
                    output+="Двести "; break;
                case 3:
                    output+="Триста "; break;
                case 4:
                    output+="Четыреста "; break;
                case 5:
                    output+="Пятьсот "; break;
                case 6:
                    output+="Шестьсот "; break;
                case 7:
                    output+="Семьсот "; break;
                case 8:
                    output+="Восемьсот "; break;
                case 9:
                    output+="Девятьсот "; break;
                default: break;
            }
        }

        if(number >= 20){
            if(number >= 100) {
                tens = Math.floorDiv(number, 10) % 10;
            }else{
                tens = Math.floorDiv(number, 10);
            }

            switch (tens){
                case 2:
                    output+="Двадцать "; break;
                case 3:
                    output+="Тридцать "; break;
                case 4:
                    output+="Сорок "; break;
                case 5:
                    output+="Пятьдесят "; break;
                case 6:
                    output+="Шестьдесят "; break;
                case 7:
                    output+="Семьдесят "; break;
                case 8:
                    output+="Восемьдесят "; break;
                case 9:
                    output+="Девяносто "; break;
                default: break;
            }
        }

        ones = number % 10;
        switch (ones){
            case 1:
                output+="Один "; break;
            case 2:
                output+="Два "; break;
            case 3:
                output+="Три "; break;
            case 4:
                output+="Четыре "; break;
            case 5:
                output+="Пять "; break;
            case 6:
                output+="Шесть "; break;
            case 7:
                output+="Семь "; break;
            case 8:
                output+="Восемь "; break;
            case 9:
                output+="Девять "; break;
            case 10:
                output+="Десять "; break;
            case 11:
                output+="Одиннадцать "; break;
            case 12:
                output+="Двенадцать "; break;
            case 13:
                output+="Тринадцать "; break;
            case 14:
                output+="Четырнадцать "; break;
            case 15:
                output+="Пятнадцать "; break;
            case 16:
                output+="Шестнадцать "; break;
            case 17:
                output+="Семнадцать "; break;
            case 18:
                output+="Восемнадцать "; break;
            case 19:
                output+="Девятнадцать "; break;
            default: break;
        }

        System.out.println(output);
    }

    static int task2(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число словами: ");
        String number = input.nextLine();
        number = number.toLowerCase();
        String[] s = number.split(" ");
        int result = 0;
        if(s.length > 3){
            result = -1;
            System.out.println("-1: [слишком большое число/число введено неправильно]");
            return result;
        }

        if(s.length == 1){
            result = one(s[0],result);
            switch (s[0]){
                case "одиннадцать":
                    result = 11; break;
                case "двенадцать":
                    result = 12; break;
                case "тринадцать":
                    result = 13; break;
                case "четырнадцать":
                    result = 14; break;
                case "пятнадцать":
                    result = 15; break;
                case "шестнадцать":
                    result = 16; break;
                case "семнадцать":
                    result = 17; break;
                case "восемнадцать":
                    result = 18; break;
                case "девятнадцать":
                    result = 19; break;
                default: break;
            }
        }

        if(s.length == 2){
            result = three(s[0], result);
            switch (s[1]){
                case "одиннадцать":
                    result += 11; break;
                case "двенадцать":
                    result += 12; break;
                case "тринадцать":
                    result += 13; break;
                case "четырнадцать":
                    result += 14; break;
                case "пятнадцать":
                    result += 15; break;
                case "шестнадцать":
                    result += 16; break;
                case "семнадцать":
                    result += 17; break;
                case "восемнадцать":
                    result += 18; break;
                case "девятнадцать":
                    result += 19; break;
                default:
                    result = two(s[0], result);
                    if(result < 20){
                        System.out.println("-1: неправильный порядок слов");
                        return -1;
                    }
                    result = two(s[1], result);
                    result =  one(s[1], result);
                    break;
            }


        }

        if(s.length == 3){
            result = three(s[0], result);
            result = two(s[1], result);
            result = one(s[2], result);
            if(result < 121){
                System.out.println("-1: неправильный порядок");
                return -1;
            }
        }

        System.out.println(result);

        return 0;
    }

    static int one(String str, int res){
        switch (str){
            case "один":
                res += 1; break;
            case "два":
                res += 2; break;
            case "три":
                res += 3; break;
            case "четыре":
                res += 4; break;
            case "пять":
                res += 5; break;
            case "шесть":
                res += 6; break;
            case "семь":
                res += 7; break;
            case "восемь":
                res += 8; break;
            case "девять":
                res += 9; break;
            case "десять":
                res += 10; break;
            default: break;
        }
        return res;
    }

    static int two(String str, int res){
        switch (str) {
            case "двадцать":
                res += 20;
                break;
            case "тридцать":
                res += 30;
                break;
            case "сорок":
                res += 40;
                break;
            case "пятьдесят":
                res += 50;
                break;
            case "шестьдесят":
                res += 60;
                break;
            case "семьдесят":
                res += 70;
                break;
            case "восемьдесят":
                res += 80;
                break;
            case "девяносто":
                res += 90;
                break;
            default:
                break;
        }
        return res;
    }

    static int three(String str, int res){
        switch (str){
            case "сто": res+=100; break;
            case "двести": res+=200; break;
            case "триста": res+=300; break;
            case "четыреста": res+=400; break;
            case "пятьсот": res+=500; break;
            case "шестьсот": res+=600; break;
            case "семьсот": res+=700; break;
            case "восемьсот": res+=800; break;
            case "девятьсот": res+=900; break;
            default: break;
        }
        return res;
    }
}
