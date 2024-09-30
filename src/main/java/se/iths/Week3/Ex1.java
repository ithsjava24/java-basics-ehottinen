package se.iths.Week3;

//todo: Skriv en metod som tar en array av int som parameter
    //todo: och om något av talen i arrayen är udda
    //todo: kasta (throw) en exception av typen RuntimeException.

public class Ex1 {
    public static void arrayMetod(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
        }
    }

}
