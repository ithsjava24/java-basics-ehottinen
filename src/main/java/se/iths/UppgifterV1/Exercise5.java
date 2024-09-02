package se.iths.UppgifterV1;

import java.util.Scanner;

public class Exercise5 {

    //odo: skriv ett program som låter användaren ange 3 heltal som argument
    //todo: om färre än 3 tal eller fler än 3 tal anges ska ett felmeddelande skrivas ut och programmet avslutas
    //todo: om annat än siffror 0-9 anges ska programmet ge ett felmeddelande men fortsätta köra programmet och ersätta argumentet som har andra tecken än 0-9 med 0
    //odo: När 3 giltiga tal finns ska det räkna ut det största och skriva ut talet

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kan du ge mig 3 heltal, tack?");

        int n1 = sc.nextInt(); //skapat plats och sparat tal
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) // om n1 är större än n2 och n3
            System.out.println(n1 + " är det största talet.");
        else if (n2 >= n1 && n2 >= n3) //om n2 är större än n1 och n3
            System.out.println(n2 + " är det största talet.");
        else // då är n3 störst
            System.out.println(n3 + " är det största talet.");

        System.out.println();
    }
}
