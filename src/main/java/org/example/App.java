package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrisOchTid[] priser = new PrisOchTid[24];

        while (true) {
            meny();
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    priser = inmatning(sc);
                    break;
                case "2":
                    minMaxMedel(sc, priser);
                    break;
                case "3":
                    sortera(sc, priser);
                    break;
                case "4":
                    bästaLaddningstid(sc);
                    break;
            }
            if (input.equals("e") || input.equals("E")) {
                break;
            }
        }
    }
    record PrisOchTid(int pris, int tid) implements Comparable <PrisOchTid> {
        @Override
    public int compareTo(PrisOchTid other){
        return this.pris - other.pris;
        }
    }

    public static void meny() {
        String t = """
                Elpriser
                ========
                1. Inmatning
                2. Min, Max och Medel
                3. Sortera
                4. Bästa Laddningstid (4h)
                e. Avsluta
                """;
        System.out.print(t);
    }

    private static String klockslag(int i) {
        if (i < 10) {
            return "0" + i;
        } else {
            return "" + i;
        }
    }

    private static PrisOchTid[] inmatning(Scanner sc) {
        PrisOchTid[] PrisLista = new PrisOchTid[24];
        String t = """
            Inmatning
            """;
        System.out.print(t);

        for (int i = 0; i < PrisLista.length; i++) {
            System.out.print("Kan du ange elpriset mellan " + klockslag(i) + " - " + klockslag(i + 1) + " i hela ören?\n");
            PrisLista[i] = new PrisOchTid(sc.nextInt(),i);
        }
        return PrisLista;
    }

    public static void minMaxMedel(Scanner sc, PrisOchTid[] priser) {
        String t = """
        Min, Max och Medel
        """;
        System.out.print(t);

        PrisOchTid min = priser[0];
        PrisOchTid max = priser[0];
        int summa = priser[0].pris;

        for (int i = 1; i < priser.length; i++) {
            if (priser[i].pris < min.pris) {
                min = priser[i];
            }
            if (priser[i].pris > max.pris) {
                max = priser[i];
            }
            summa += priser[i].pris;
        }
        double medel = (double) summa / priser.length;

        String minString = String.format("Lägsta pris: " +klockslag(min.tid) + "-" +klockslag(min.tid +1) + ", %d öre/kWh \n", min.pris);
        String maxString = String.format("Högsta pris: " +klockslag(max.tid) + "-" +klockslag(max.tid +1) + ", %d öre/kWh \n", max.pris);
        String medelString = String.format("Medelpris: %f öre/kWh\n", medel);
        System.out.print(minString + maxString + medelString);
    }

    public static void sortera(Scanner sc, PrisOchTid[] priser) {
        String t = """
        Sortera
        """;
        System.out.print(t);

        Arrays.sort(priser,(o1, o2)-> o2.pris() - o1.pris());

        for (PrisOchTid v : priser) {
            System.out.print(String.format("%s-%s %d ören\n", klockslag(v.tid),klockslag(v.tid+1), v.pris));
        }
    }
    public static void bästaLaddningstid(Scanner sc) {
        String t = """
        Bästa Laddningstid (4h)
        """;
        System.out.print(t);
    }
}
