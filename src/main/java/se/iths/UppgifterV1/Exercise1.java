package se.iths.UppgifterV1;

import java.util.Scanner;

public class Exercise1 {
    //odo: fråga efter namn
    //odo: skriv ut Hej Namn
    //odo: rätta liten bokstav till stor bokstav

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//skapar scanner sc
        System.out.println("Vad heter du?");//frågar
        String name;//skapar en plats att spara namn på
        name = sc.nextLine();//sparar namn
        //System.out.println("Hej " + name + "!");//säger hej till namn

        String first = name.substring(0,1); //0 = från första bokstaven 1= tar inte andra bokstaven
        String capital = first.toUpperCase(); //Gör stor bokstav
        String rest = name.substring(1); //kopiera resten från andra bokstaven framåt
        name = capital + rest; //byter ut name med stor bokstav
        System.out.println("Hej " + name + "!");//säger hej till namn med stor bokstav
    }
}
