package se.iths.Week1;

public class Ex8 {

    //odo: skapa en array med jämnt antal tal men minst 4 ex: [1,2,1,3,3,4]
    //odo: jämför de första två talen med de nästa två talen
    //odo: programmet ska då ta reda på om någon eller båda siffrorna i det första paret förekommer i det andra paret
    //odo: om det är sant fortsätt jämförelsen men flytta nu fram två steg
    //odo: om alla par i arrayen har minst en siffra gemensamt ska programmet skriva ut Everywhere
    //odo: men om någon jämförelse mellan två par saknar likadana siffror ska programmet skriva ut 50t Somewhere
    //odo: och om inga par delar siffror ska programmet skriva ut Nowhere

    public static void main(String[] args) {

        int[] numbers = {1, 2, 1, 3, 3, 4};
        //1,2,1,3,3,4   Everywhere
        //1,2,1,3,4,5   Somewhere
        //1,2,3,4,5,6   Nowhere

        boolean everywhere = true;
        boolean somewhere = false;

        for (int i = 0; i < numbers.length - 3; i += 2) {

            if (numbers[i] == numbers[i + 2] || numbers[i + 1] == numbers[i + 3] ||
                    numbers[i] == numbers[i + 3] || numbers[i + 1] == numbers[i + 2]) {
                somewhere = true;
            } else {
                everywhere = false;

            }
        }
        if (everywhere) System.out.println("everywhere");
        else if (somewhere) System.out.println("somewhere");
        else System.out.println("nowhere");
    }
}
