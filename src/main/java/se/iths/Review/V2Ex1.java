package se.iths.Review;

import java.util.Scanner;


public class V2Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriver in första numret: ");
        int num1 = sc.nextInt();

        System.out.println("Skriver in andra numret: ");
        int num2 = sc.nextInt();

        System.out.println("Skriver in tredje numret: ");
        int num3 = sc.nextInt();

        System.out.println("Det minsta numret är: " + findMinimum(num1, num2, num3));
        System.out.println(findMinimum(new int[]{num1, num2, num3}));

    }
                            //Datatyp + Array + Variabel
    public static int findMinimum(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        return min;
    }

    public static int findMinimum(int a, int b, int c){
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return min;

    }

}
