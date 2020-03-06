package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У тебя есть пять попыток узнать букву, которую я загадал");

       // char symbol [] = new char[a];



        for (int i = 0; i < 5 ; i++){
            String a = scanner.nextLine();
            if ( a.equals("a")) {
                System.out.println("Bingo");
                System.out.println("Конец игры, вы все равно придурок!");break;
            }
            else if (i == 4){
                System.out.println("Конец игры, ты обосрался");
                }
            else

            System.out.println("Говно собачье");
            }
        }


    }

