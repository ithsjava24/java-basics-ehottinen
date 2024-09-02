package se.iths.UppgifterV1;

import java.util.Scanner;

public class Exercise2 {

    //odo: fråga användaren om två tal
    //odo: skriv ut dem
    //odo: Skriv ut deras medelvärde
    //odo: Talen ska vara heltal Medelvärdet ska vara i decimaltal

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //skapar scanner
        System.out.println("Ge mig två tal, tack!"); //frågar efter tal
        int n1 = sc.nextInt(); //skapar en plats och sparar talet
        int n2 = sc.nextInt(); //same
        //System.out.println(n1 + " " + n2); //skriver ut talen
        //System.out.println(n1 + n2 / 2); //räknar ut medelvärdet men i heltal
        double average = (double)(n1 + n2) / 2; //räknar ut medevärdet i decimaltal / skapar double med summan
        System.out.println("Medelvärdet är: " + average); //skriver ut

    }
}
