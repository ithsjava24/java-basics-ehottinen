package se.iths.Review;

public class ReviewEx5 {

    public static void main(String[] args) {}
    if (args.length != 3) {
        System.out.println("Felaktig inmatning, måste vara 3 nummer");
        return;

        int[] intergers = new int[3];
        for (int i = 0; i < args.length; i++){
            try {
                integers[i] = Interger.paraseInt(args[i]);
            } catch (NumberFormatException e) {
                //Skriv ut felmeddelande
                System.out.println("Fel format! Förväntande siffror");
                //Spara 0 på platsen i args
                args[i] = "0";
            }
        }

        int max = args[0];
        for (int i = 0; i < intergers.length; i++){
            if (intergers[i] > max){
                max = intergers[i];
            }
        }
    }
}
