package se.iths.Week1;

import java.util.Scanner;

public class Ex2 {

    //odo: fråga användaren om två tal
    //odo: skriv ut dem
    //odo: Skriv ut deras medelvärde
    //odo: Talen ska vara heltal Medelvärdet ska vara i decimaltal

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kan du ge mig två tal,tack?");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        double average = n1 + n2 / 2;
        System.out.println("Medelvärde: " + average);




    }
}
