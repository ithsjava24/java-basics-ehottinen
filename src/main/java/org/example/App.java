package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrisOchTid[] priserOchTider = new PrisOchTid[24];

        while (true) {
            meny();
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    priserOchTider = inmatning(sc);
                    break;
                case "2":
                    minMaxMedel(sc, priserOchTider);
                    break;
                case "3":
                    sortera(sc, priserOchTider);
                    break;
                case "4":
                    bästaLaddningstid(sc, priserOchTider);
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

    public static String kommatecken(double value) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("sv", "SE"));
        return df.format(value);
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
        PrisOchTid[] priserOchTider = new PrisOchTid[24];
        String t = """
            Inmatning
            """;
        System.out.print(t);

        for (int i = 0; i < priserOchTider.length; i++) {
            System.out.print("Kan du ange pris per timma " + klockslag(i) + " - " + klockslag(i + 1) + " i ören?\n");
            priserOchTider[i] = new PrisOchTid(sc.nextInt(),i);
            sc.nextLine();
        }
        return priserOchTider;
    }

    public static void minMaxMedel(Scanner sc, PrisOchTid[] priserOchTider) {
        String t = """
        Min, Max och Medel
        """;
        System.out.print(t);

        PrisOchTid min = priserOchTider[0];
        PrisOchTid max = priserOchTider[0];
        int summa = priserOchTider[0].pris;

        for (int i = 1; i < priserOchTider.length; i++) {
            if (priserOchTider[i].pris < min.pris) {
                min = priserOchTider[i];
            }
            if (priserOchTider[i].pris > max.pris) {
                max = priserOchTider[i];
            }
            summa += priserOchTider[i].pris;
        }
        double medel = (double) summa / priserOchTider.length;

        String minString = String.format("Lägsta pris: " +klockslag(min.tid) + "-" +klockslag(min.tid +1) + ", %d öre/kWh\n", min.pris);
        String maxString = String.format("Högsta pris: " +klockslag(max.tid) + "-" +klockslag(max.tid +1) + ", %d öre/kWh\n", max.pris);
        String medelString = String.format("Medelpris: %.2f öre/kWh\n", medel);
        System.out.print(minString + maxString + medelString);
    }

    public static void sortera(Scanner sc, PrisOchTid[] priserOchTider) {
        String t = """
        Sortera
        """;
        System.out.print(t);

        Arrays.sort(priserOchTider,(o1, o2)-> o2.pris() - o1.pris());

        for (PrisOchTid v : priserOchTider) {
            System.out.print(String.format("%s-%s %d öre\n", klockslag(v.tid),klockslag(v.tid+1), v.pris));
        }
    }

    public static void bästaLaddningstid(Scanner sc, PrisOchTid[] priserOchTider) {
        String t = """
        Bästa Laddningstid (4h)
        """;
        System.out.print(t);

        int timma = Integer.MAX_VALUE;
        double minimum = Double.MAX_VALUE;

        for (int i = 0; i <= priserOchTider.length -4; i++)
        {
            int sum = 0;

            for (int j = i; j < i + 4; j++) {
                sum += priserOchTider[j].pris;
            }
            double medel = sum / 4.0;
            if (medel < minimum) {
                minimum = medel;
                timma = i;
            }
        }
        System.out.print("Påbörja laddning klockan " + klockslag(timma) + "\n");
        System.out.print("Medelpris 4h: " + kommatecken(minimum) + " öre/kWh\n");
    }
}
