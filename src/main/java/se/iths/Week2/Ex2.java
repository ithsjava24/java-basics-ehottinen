package se.iths.Week2;

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

        if (WhatPassword(password)) {
            System.out.println("Yay, du gjorde det!");
        } else {
            System.out.println("Bzz Bzz Fel!");
        }
    }

    public static boolean WhatPassword(String password) {

        if (password.length() < 10){
            return false;
        }return true;

    }

}