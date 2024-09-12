package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            meny();
            String name = sc.nextLine();
            switch(name){
                case "1":
                    inmatning(sc);
                    break;
                case "2":
                    minMaxMedel(sc);
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

        System.out.print("Inmatning?\n");
        for (int i = 0; i < 12; i++){
            System.out.print("Kan du ange elpriset mellan " + klockslag(i+i) + " - " + klockslag(i+i+2) + " i hela ören?\n");
            PrisLista [i] = sc.nextInt();
        }
        return PrisLista;
    }
    public static void minMaxMedel(Scanner sc){
        System.out.print("Min, Max och Medel\n");
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
