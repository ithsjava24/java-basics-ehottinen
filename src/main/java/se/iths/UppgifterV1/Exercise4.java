package se.iths.UppgifterV1;

import java.util.Scanner;

public class Exercise4 {

    //odo: frågar efter namnet på en veckodag på engelska
    //odo: använd: enhanced switch sats för att översätta namnet på dagen till ett tal (Monday = 1)
    //odo: ogilltiga namn ska ge 0
    //odo: programmet ska förstå små, stora bokstäver och kortversionen av namn

    public static void main(String[] args) {
        //public = tillgänglig utanför klassen
        // static = för komplicerad just nu
        // void = returnerar ej
        // main = metod
        // String = textsträng
        // args = argument

        Scanner sc = new Scanner(System.in); // skapar en scanner kom ihåg att importa den i package)
        System.out.println("Hello, what day is it today?"); // fråga!
        String input = sc.nextLine().toLowerCase(); // jag har tagit in en sträng osm gör bara små bokstäver för att
        // då kan vi ha två case mindre ex "Monday" och "MONDAY" behövs då inte


        int day = 0; // skapar base case / bas fall
            switch (input) { //switch enhanced: en kompakt version av switch case
                case "monday", "mon" -> day = 1; // matcha monday, mon etc till ett nr
                case "tuesday", "tue" -> day = 2;
                case "wednesday", "wed" -> day = 3;
                case "thursday", "thu" -> day = 4;
                case "friday", "fri" -> day = 5;
                case "saturday", "sat" -> day = 6;
                case "sunday", "sun" -> day = 7;
            }
            System.out.println(day); //skriv ut numret
    }
}
