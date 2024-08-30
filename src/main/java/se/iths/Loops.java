package se.iths;

import java.util.Scanner;

public class Loops {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Hej");
            // Fråga användaren efter input
            System.out.print("Write 1 to continue or 0 to exit: ");
            int n = scanner.nextInt();
            break;
        }
    }
}

//        /* System.out.println("Hej");
//        System.out.println("Hej");
//        System.out.println("Hej");
//        Loop unrolling, här kopierar man manuellt koden själv för en loop */
//
//        while (true) {
//            // while(true) Skapar en loop förevigt till du manuellt avbryter processen eller skapar en input
//        }
//        System.out.println("Hej");
//        // Fråga användaren efter input
//        System.out.print("Write 1 to continue or 0 to exit: ");
//        int n = scanner.nextInt();
//        if (n == 0) {
//            break; // avslutar loopen
//
//        System.out.println("I see that you want to continue"); */
//
//                // return; hoppar till main metoden eller andra metoder
//                // continue; hoppar till System.out.println("Hej"); är sällan nödvändig när man skriver kod
//
//            /* else if (n > 0) {
//                // Inte alltid nödvändigt att skriva ut
//                System.out.println("I see that you want to continue");
//            else if(n == 1) {
//                System.out.println("I see that you want to continue"); */