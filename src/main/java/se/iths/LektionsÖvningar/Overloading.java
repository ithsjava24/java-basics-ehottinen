package se.iths.LektionsÖvningar;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.0,2.0));

        //Math.abs(2.0f);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;

    }
}
