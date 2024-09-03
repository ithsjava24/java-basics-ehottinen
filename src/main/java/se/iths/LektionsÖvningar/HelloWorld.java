package se.iths.LektionsÖvningar;

import java.util.Scanner;

public class HelloWorld {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello from Intellij");
        String Text = scanner.nextLine();
        System.out.println("Du skrev " + Text);
        System.out.println("Bye!");


    }
}

