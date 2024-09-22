package se.iths.Week1;

import java.util.Arrays;
import java.util.Random;

//6
//odo: skriv ett program som skapar en array med 10 heltal av int
//odo: skriv en kod som skapar en ny array med samma värden från den förra fast den skriver ut dem baklänges
//odo: skriv sedan ut båda arrayerna för att se att det blev rätt

//7
//odo: plocka ut alla platser vars index är ett jämnt tal och beräkna summan av värdena och skriv ut summan

public class Ex6o7 {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

            int[] anArray = new int[ARRAY_SIZE];
            int[] reverseArray = new int[ARRAY_SIZE];

            Random rand = new Random();
            for (int i = 0; i < ARRAY_SIZE; i++) {
                int randomNumber = rand.nextInt(10);
                anArray[i] = randomNumber;
            }
            int j = ARRAY_SIZE - 1;
            for (int i = 0; i < ARRAY_SIZE; i++) {
                reverseArray[j] = anArray[i];
                j--;
            }
            System.out.println(Arrays.toString(anArray));
            System.out.println(Arrays.toString(reverseArray));
            int sum = 0;
            for (int i = 0; i < anArray.length; i += 2) {
                if ((i % 2) == 0) sum += anArray[i];
            }
            System.out.println(sum);

            // Min lösning
//        int[] arrayForward = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arrayForward.length; i++)
//            System.out.print(arrayForward[i]);
//
//        System.out.println();
//
//        int[] arrayBackward = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = arrayBackward.length -1; i >= 0; i--)
//            System.out.print(arrayBackward[i]);
//
//        int sum = 0;
//        for (int i = 0; i < arrayForward.length; i+=2) {
//            sum += arrayForward[i];
//        }
//        System.out.println(sum);
    }
}
