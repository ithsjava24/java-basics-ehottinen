package se.iths.Review;

import java.util.Scanner;

public class ReviewUppg2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange två siffror: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double med = (num1 + num2)/ 2f;
        System.out.println("Medelvärdet är: " + med);


    }
}
