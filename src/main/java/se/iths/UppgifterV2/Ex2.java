package se.iths.UppgifterV2;

//todo: Skriv en statisk metod som returnerar en boolean och tar en String password som parameter.
//todo: Metoden ska returnera true om password innehåller en textsträng som uppfyller följande regler:
//odo: Ett lösenord ska ha minst 10 tecken.
//todo: Endast bokstäver a-z och siffror 0-9 är tillåtna.
//todo: inst 2 av tecknen ska vara siffror.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in ditt lösenord: ");

        int min = 10;

        String password = sc.nextLine();
        password = sc.nextLine();

        if(password.length() >= min){

        }

    }

    public static boolean WhatPassword(String[] password) {

        if (password.equals("")){
            return false;
        }return true;

    }

}