package se.iths.UppgifterV1;

import java.util.Scanner;
import java.math.*;

public class Exercise3 {

    //odo: fråga efter två tal
    //odo: skriv ut summan av talen
    //odo: om talen är samma värde ska summan dubblas innan de skrivs ut
    //odo: är talen negativa ska de göras till positiva före sumering

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //skapa en scanner
        System.out.println("Kan jag få två tal, tack?"); //fråga
        double n1 = sc.nextDouble(); // skapa plats och spara tal (man kan "inte få fel" med double)
        double n2 = sc.nextDouble(); // same

        n1 = Math.abs(n1); // absolutvärde gör minus till plus och plus till plus
        n2 = Math.abs(n2); // same

        double sum = n1 + n2; // sumerar n1, n2 för att kunna dublera summan i if

        if (n1==n2){ //om de har samma värde
            sum = sum * 2; //dubblerar värdet
        }
        System.out.println("Summan är " + (sum)); //skriver ut värdet

    }
}
