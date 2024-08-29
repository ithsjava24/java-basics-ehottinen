package se.iths;

import java.util.Scanner;

public class ArrayExample {

        // Read one number from user and print it
        // Read two numbers from user and print them
        // Read 10 numbers from user and print them

        public static void main(String[] args) {

            Scanner numberOne = new Scanner(System.in);

            System.out.println("Enter an integer: ");

            int numberOneInt = numberOne.nextInt();
            System.out.println(numberOneInt);

            int numberTwoInt = numberOne.nextInt();
            System.out.println(numberTwoInt);


            int[] numbers = new int[10];
            for(int i = 0; i < numbers.length; i++) {

                numbers[i] = numberOne.nextInt();
            }
            for(int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
}
