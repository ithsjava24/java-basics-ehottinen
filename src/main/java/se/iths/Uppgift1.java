package se.iths;

import java.util.Scanner;

public class Uppgift1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String namn = sc.nextLine();

         System.out.println("Hej " + namn + "!");

         String tal = sc.nextLine();
         int tal2 = Integer.parseInt(tal);
         System.out.println("Är du " + tal2 + " år gammal?");

//        int x;
//        x = 15;
//        System.out.println(x); // 15

//        int x = 10;
//        int y = x -1;
//        System.out.println(y); // 9

//        int x, y;
//        x = (int)120.954; //(int) gör float till heltal. Float = decimaltal.
//        y = x * 2;
//        System.out.println(x + y);
//        y+x=360 x+y=x+x+x=x*3=3x=3x/3=360/3=120

//        String s = "amm";
//        s = "fäkt"; // s = tilldelar nytt värde (från amm till fäkt)
//        System.out.println("An" + s + "a");

//        String a = "an", b = "be", d = "do"; // sätter ihop flera strings
//        System.out.println(a + b + a +d + b); //anbeandobe

//        int x = 2, y = 4, z = 8;
//        System.out.println( (x * y + z) / y - z +y / (x * z /x) ); // - 4
    }
}

