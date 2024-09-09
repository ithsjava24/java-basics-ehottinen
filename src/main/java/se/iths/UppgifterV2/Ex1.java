package se.iths.UppgifterV2;

import java.util.Scanner;

//odo: skriv en statisk metod som returnerar det minsta talet av 3 tal
//odo: Vad ska metoden heta? FindMinimum
//odo: Returtyp och parametrar? Returntyp: Int Parametrar: (int a, int b, int c)

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv tre tal:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Minimum är: " + FindMinimun( a,  b,  c));
    }

    public static int FindMinimun(int a, int b, int c) {

    if (a < b  && a < c){
        return a;
    } else if (b < c){
        return b;
    } return c;

    }
}
