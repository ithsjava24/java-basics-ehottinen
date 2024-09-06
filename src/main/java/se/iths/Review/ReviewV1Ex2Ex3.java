package se.iths.Review;

import java.util.Scanner;

public class ReviewV1Ex2Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ex2
        System.out.println("Ange två siffror: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double med = (num1 + num2)/ 2f;
        System.out.println("Medelvärdet är: " + med);

        //Ex3
        //num1 = Math.abs(num1);
        //num1 = num1 < 0 ? -num1 : num1; //< 0 ? är samma som if else i Math
        if (num1 < 0){
            num1 = -num1;
        }

        if (num2 < 0){
            num2 = num2 * -1;
        }
        if (num1 == num2){
            System.out.println("Summan av de två talen är gånger två är: " + (num1 + num2) * 2);
        }
        else{
            int sum = num1 + num2;
            System.out.println("Summan av de två talen är: " + (sum) *2 );
        }



    }
}
