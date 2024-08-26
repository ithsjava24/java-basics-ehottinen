package se.iths;

import java.util.Scanner;

public class Helloworld {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello from Intellij");
        String text = scanner.nextLine();
        System.out.println("Du skrev " + text);

        System.out.println("Okej, gå hem då! Bye!");

    }
}

