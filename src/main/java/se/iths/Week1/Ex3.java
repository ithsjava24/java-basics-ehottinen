package se.iths.Week1;

import java.util.Scanner;

public class Ex3 {

    //odo: fråga efter två tal
    //odo: skriv ut summan av talen
    //odo: om talen är samma värde ska summan dubblas innan de skrivs ut
    //odo: är talen negativa ska de göras till positiva före sumering

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ge mig två tal, tack");
        double n = sc.nextDouble();
        double n2 = sc.nextDouble();

        n = Math.abs(n);
        n2 = Math.abs(n2);

        double sum = n + n2;

        if (n==n2) {
            sum = sum * 2;
        }
        System.out.println("Summan är: " + sum);
    }
}