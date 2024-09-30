package se.iths.Week2;

//odo: Skriv en statisk metod som returnerar en boolean och tar en String password som parameter.
//odo: Metoden ska returnera true om password innehåller en textsträng som uppfyller följande regler:
    //odo: Ett lösenord ska ha minst 10 tecken.
    //odo: Endast bokstäver a-z och siffror 0-9 är tillåtna.
    //odo: inst 2 av tecknen ska vara siffror.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(isValidPassword("abc123defgäö"));
    System.out.println(isValidPassword("abc123def"));
    System.out.println(isValidPassword("abc123defg!"));
    System.out.println(isValidPassword("abc123defgda"));

    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        int digMax = 0;
        for (int i = 0; i < password.length(); i++) {
            char digitsChar = password.charAt(i);

            if (digitsChar >= 'a' && digitsChar <= 'z') {
                continue;
            }
            if (Character.isDigit(digitsChar)) {
                digMax++;
                continue;
            }
            return false;
        }
        return digMax >= 2;
    }
}