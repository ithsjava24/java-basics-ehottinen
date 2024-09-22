package se.iths.Week1;

import java.util.Scanner;

public class Ex4 {

    //odo: frågar efter namnet på en veckodag på engelska
    //odo: använd: enhanced switch sats för att översätta namnet på dagen till ett tal (Monday = 1)
    //odo: ogilltiga namn ska ge 0
    //odo: programmet ska förstå små, stora bokstäver och kortversionen av namn

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week is it?");

        String input = sc.nextLine().toLowerCase();

        int day = switch (input) {
            case "monday", "mon" -> 1;
            case "tuesday", "tue" -> 2;
            case "wednesday", "wed" -> 3;
            case "thursday", "thu" -> 4;
            case "friday", "fri" -> 5;
            case "saturday", "sat" -> 6;
            case "sunday", "sun" -> 7;
            default -> 0;
        };
        System.out.println(day);
    }
}
