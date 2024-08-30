package se.iths.Review;

import java.util.Scanner;

public class ReviewUppg1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = sc.nextLine();

//        String s = name.substring(0, 1).toUpperCase();
//        String nameCapitilized = s + name.substring(1);

        char[] arr = name.toCharArray();

        if(Character.isLowerCase(arr[0])){
          arr[0] = Character.toUpperCase(arr[0]);
        }

        System.out.println("Hej " + name + "!");
//        System.out.println("Hej " + nameCapitilized + "!");


    }
}
