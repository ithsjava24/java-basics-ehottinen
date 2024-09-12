package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            Meny();
            String name = sc.nextLine();
            switch(name){
                case "1":
                    Inmatning(sc);
                    break;
                case "2":
                    MinMaxMedel(sc);
                    break;
                case "3":
                    Sortera(sc);
                    break;
                case "4":
                    BästaLaddningstid(sc);
                    break;
            }
            if (name.equals("e") || name.equals("E")){
                break;
            }
        }

    }
    public static void Meny(){
        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, Max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid (4h)");
        System.out.println("e. Avsluta");
    }
    public static int[] Inmatning(Scanner sc){
        int[] PrisLista = new int[12];

        System.out.println("Inmatning");
        for (int i = 0; i < 12; i++){
            System.out.println("Kan du ange elpriset mellan " +  + " i hela ören?");
            PrisLista [i] = sc.nextInt();
        }

        return PrisLista;
    }
    public static void MinMaxMedel(Scanner sc){
        System.out.println("Min, Max och Medel");
        sc.nextLine();
    }
    public static void Sortera(Scanner sc){
        System.out.println("Sortera");
        sc.nextLine();
    }
    public static void BästaLaddningstid(Scanner sc){
        System.out.println("Bästa Laddningstid (4h)");
        sc.nextLine();
    }
}
