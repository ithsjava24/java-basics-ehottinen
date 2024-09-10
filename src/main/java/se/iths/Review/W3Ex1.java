package se.iths.Review;

import java.util.Arrays;

public class W3Ex1 {
    //todo: Skriv en metod som tar en array av int som parameter
    //todo: och om något av talen i arrayen är udda, kasta (throw) en exception av typen RuntimeException.

    public static void main(String[] args){

        int[] number = {3, 4, 5};
//        int[] copy = Arrays.copyOfRange(number, 1, 3);
//        System.out.println(Arrays.toString(copy));
        number[0] = 74846;
        number[1] = 56;
        number[2] = 4766;

        evenOrOdd(number);

    }
    public static void evenOrOdd(int[] input){
        for (int i = 0; i < input.length; i++){
            if (input[i] %2 != 0){
                throw new RuntimeException("Det finns udda siffror! ");
            }
        }
    }
}
