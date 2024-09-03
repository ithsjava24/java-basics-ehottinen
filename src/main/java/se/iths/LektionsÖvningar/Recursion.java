package se.iths.LektionsÖvningar;

public class Recursion {
    public static int counter = 0;

    public static void main(String[] args) {
        recursion();

    }


    public static void recursion() {

//        long i = 0;
//        long i1 = 0;
//        long i2 = 0;
//        long i3 = 0;

        System.out.println(++counter);
        recursion();

    }

    public static void tail(int n){
        if(n == 1)
            return;
        else
            System.out.println(n);
        tail(n-1);
    }

    public static void head(int n){
        if(n == 0)
            return;
        else
            head(n-1);
        System.out.println(n);

    }
}
