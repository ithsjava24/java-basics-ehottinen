package se.iths;

public class MultiplicationTable {

    public static void main(String[] args) {
        //printMultiplicationTable(2); //Vilken multiplikationstabell man ska använda ex: 2. Också blir main metoden
        printFor(2);
        int sum = add(2,3);
//        int tal1 =2;
//        int tal2 =3;
//        int prod = product (tal1, tal2); försökte göra en automatisk metod byte
        System.out.println(sum);
    }
    //    public static void printMultiplicationTable(final int table) { //metoden: printMultiplicationsTable.
    public static void printFor(int table) {
        for (int i = 1; i <= 10; i++) { //loop startar vid 1, slutar vid 10
            System.out.println(table + " * " + i + " = " + table * i); //skriver ut 2ans multiplikationstabell, med loop * table värde
//            // skriva bara (table * i); skriver bara ut summan
        }
    }

    public static int add(int a, int b) {
        System.out.println("Calculating sum");
        return a + b; //sista värdet är det som behöver returneras

    }
}
