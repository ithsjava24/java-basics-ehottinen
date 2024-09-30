package se.iths.Week2;

import java.util.Scanner;

//todo: skriv en statisk metod som returnerar det minsta talet av 3 tal
//todo: Vad ska metoden heta? FindMinimum
//todo: Returtyp och parametrar? Returntyp: Int Parametrar: (int a, int b, int c)

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in första numret: ");
        int num1 = sc.nextInt();
        System.out.println("Skriv in andra numret: ");
        int num2 = sc.nextInt();
        System.out.println("Skriv in tredje numret: ");
        int num3 = sc.nextInt();

        System.out.println("Det minsta numret är: " + findMinimum(num1,num2,num3));
        System.out.println(findMinimum(num1,num2,num3));
    }
    public static int findMinimum(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;
    }
}
