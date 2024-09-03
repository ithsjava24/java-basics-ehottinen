package se.iths.LektionsÖvningar;
//package är ett keyword. classen package ligger i se.iths.LektionsÖvningar
    //filen heter SyntaxExample.java och finns i paketet
        //när filen gått i kompliatorn så heter den SyntaxExamlpe.class

public class SyntaxExample {
    //public är ett keyword. Styr vår access till classen eller metoden. Access modifier.
    //skriver man inte public så är det i default och bara classer i samma packet kan ses.
    //class är ett keyword. class är en byggsten vi kan placera metoder i och i metoden kan vi placera javakod i
    //syntaxExample namn på fil och denna classen.
    // { berättar vilka delar till classen. { start = måsvinge } stopp = måsvinge. Måste alla matcha! body code block?
    public static void main(String[] args) {
        //static är ett keyword. Som betyder att allt ex: metoden main tillhör klassen. Finns bara i ett exemplar. En statisk miljö den befinner sig i.
        //Void är ett keyword. returnerar inte någonting.
        //main är ett metodnamn. Finns alltid en () efter namnet.
        //String[] är en array. []=array. En String array.
        //args är en identifierare som vi har namngivit. är ett argument. Allt som står mellan () kallas för parametrar.
        int number = 10;

        double decimalNumber = 5.5;
        String message = "Hello Java!";

        int sum = number + 5;
        //int är ett keyword. Interger
        //sum
        // =
        // number + 5; en aretmetisk operator. Aretmetrisk uttryck.  som får java att be processorn att addera med 5. och pga att 5 är en int så kommer den att bli ett heltal.
        double product = decimalNumber * 2;
        //
        //product: primitivt datanamn.
        //decimalNumber * 2. flyttalsdelen. flyttal med decimaler.

        if (sum > 10) {
            //if är ett keyword för villkor.
            //allt inom () är ett villkor. if kan inte ta emot något förutom en boolean. java är strikt.
            System.out.println("Sum is grater than 10");
            //Sytem är en klass. och på den finns det en metod som heter println.
            //
        } else {
            //motsatsen till if.
            System.out.println("Sum is 10 or less");
        }
        for (int i = 0; i < number; i++) {
            //loop. använder forsyntaxen.
            //(int i = 0; körs först innan loppen kommer igång.
            //i < number; jämförelseoperator. behöver innehålla en boolean.
            //i++) körs i slutet av varje runda. postfix incrument.
            System.out.println("Loop iteration: " + i);
        }
    }
}
