package se.iths.UppgifterV1;

public class Exercise6 {
    public static void main(String[] args) {

        //odo: skriv ett program som skapar en array med 10 heltal av int
        //odo: skriv en kod som skapar en ny array med samma värden från den förra fast den skriver ut dem baklänges
        //odo: skriv sedan ut båda arrayerna för att se att det blev rätt

        int[] myNum = {1,2,3,4,5,6,7,8,9,10}; // en array
        for (int i = 0; i < myNum.length; i++) { // går genom min array
            System.out.print(myNum[i]); //skriver ut min array horisontellt
        }
        System.out.println(); //gör utskriften snyggare

        for (int i = myNum.length -1; i >= 0; i--) { // går igenom min array baklänges
            System.out.print(myNum[i]); //skriver ut min array horisontellt
        }
    }
}
