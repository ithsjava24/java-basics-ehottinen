package se.iths.Week1;

import java.util.Scanner;

public class Ex5 {

    //odo: skriv ett program som låter användaren ange 3 heltal som argument
    //odo: om färre än 3 tal eller fler än 3 tal anges ska ett felmeddelande skrivas ut och programmet avslutas
    //odo: om annat än siffror 0-9 anges ska programmet ge ett felmeddelande men fortsätta köra programmet
    // och ersätta argumentet som har andra tecken än 0-9 med 0
    //odo: När 3 giltiga tal finns ska det räkna ut det största och skriva ut talet

   public static void main(String[] args) {

       if(args.length != 3) {
           System.out.println("Feeeeeeel, vad dålig du är...");
           return;
       }

       int [] integers = new int[3];
       for (int i = 0; i < args.length; i++) {
           try {
               integers[i] = Integer.parseInt(args[i]);
           }
           catch (NumberFormatException e) {
               System.out.println("Bzz Bzz! Ska vara nummer mellan 0-9!");
               integers[i] = 0;
           }
       }
       int max = integers[0];
       for(int i = 1; i < integers.length; i++) {
           if(integers[i] > max) {
               max = integers[i];
           }
       }
       System.out.println(max);
   }
}
