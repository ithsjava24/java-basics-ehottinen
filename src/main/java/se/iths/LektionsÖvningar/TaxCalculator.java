package se.iths.LektionsÖvningar;

    //todo: skriv en metod calculateTax

public class TaxCalculator {

    public static void main(String[] args) {
        System.out.println(calculateTax(110000));
        System.out.println(calculateTax(90000) * 100);
    }

    public static float calculateTax(int income) {
        if(income > 100_000){ // income som är större än 100_000
            return (income - 100_000) * 0.4f + 30_000;
        }
        if(income <= 100_000){
            return 0;
        }

        //throw new IllegalStateException();
        return income * 0.3f;
    }
}
