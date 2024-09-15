package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] priser = {0,1,2,3,4,5,6,7,8,9,10,11,12};

        while(true){
            meny();
            String name = sc.nextLine();
            switch(name){
                case "1":
                    priser = inmatning(sc);
                    break;
                case "2":
                    minMaxMedel(sc, priser);
                    break;
                case "3":
                    sortera(sc);
                    break;
                case "4":
                    bästaLaddningstid(sc);
                    break;
            }
            if (name.equals("e") || name.equals("E")){
                break;
            }
        }

    }
    public static void meny(){
        System.out.print("Elpriser\n");
        System.out.print("========\n");
        System.out.print("1. Inmatning\n");
        System.out.print("2. Min, Max och Medel\n");
        System.out.print("3. Sortera\n");
        System.out.print("4. Bästa Laddningstid (4h)\n");
        System.out.print("e. Avsluta\n");
    }
    private static String klockslag(int i) {
        if(i < 10){
            return "0" + i + ":00";
        }else{
            return "" + i + ":00";
        }
    }
    public static int[] inmatning(Scanner sc){
        int[] PrisLista = new int[12];

        System.out.print("Inmatning\n");
        System.out.print("========\n");
        for (int i = 0; i < 12; i++){
            System.out.print("Kan du ange elpriset mellan " + klockslag(i+i) + " - " + klockslag(i+i+2) + " i hela ören?\n");
            PrisLista [i] = sc.nextInt();
        }
        System.out.print("Tryck ENTER för att återgå till menyn: \n");
        //Todo: Blockar inte som den ska, hitta varför
        String test = sc.nextLine();
        return PrisLista;
    }
    public static void minMaxMedel(Scanner sc, int[] priser){
        System.out.print("Min, Max och Medel\n");
        System.out.print("========\n");
        int min = priser[0];

        for (int i = 1; i < priser.length; i++) {
            if (priser[i] < min) {
                min = priser[i];
            }
        }
        int max = priser[0];

        for (int i = 1; i > priser.length; i++) {
            if (priser[i] > max) {
                max = priser[i];
            }
        }

        int summa = 0;

        for (int varde : priser) {
            summa += varde;
        }
        double medel = (double) summa / priser.length;
        System.out.print("Minimumvärdet är: " + min + "\n");
        System.out.print("Maximumvärdet är: " + max + "\n");
        System.out.print("Medelvärdet är: " + medel + "\n");
        System.out.print("\n");
        System.out.print("Tryck ENTER för att återgå till menyn: \n");
        sc.nextLine();
    }
    public static void sortera(Scanner sc){
        System.out.print("Sortera\n");
        sc.nextLine();
    }
    public static void bästaLaddningstid(Scanner sc){
        System.out.print("Bästa Laddningstid (4h)\n");
        sc.nextLine();
    }
}
