package se.iths.Week1;

import java.util.Scanner;

public class Ex1 {

    //odo: fråga efter namn
    //odo: skriv ut Hej Namn
    //odo: rätta liten bokstav till stor bokstav

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vad heter du?");

        String name = sc.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Hej " + name + "!");
    }
}
