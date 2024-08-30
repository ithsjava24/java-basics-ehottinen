package se.iths.Review;

import java.util.Scanner;
public class ReviewEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
        System.out.println("What day of the week is it? ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        //dayOfWeek = dayOfWeek.sustring(0,3);

        int dayNumber = switch (dayOfWeek){
            case "monday", "mon" -> 1;
            case "tuesday", "tue" -> 2;
            case "wednesday", "wed" -> 3;
            case "thursday", "thu" -> 4;
            case "friday", "fri" -> 5;
            case "saturday", "sat" -> 6;
            case "sunday", "sud" -> 7;
            default -> 0;
            // koden avslutar programmet och ger error
            // default -> throw new RuntimeException();
        }

        System.out.println("Ditt nummer är: " + dayNumber);
}
