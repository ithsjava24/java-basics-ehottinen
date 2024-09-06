package se.iths.Review;

public class ReviewV1Ex8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 3, 4};
        //1,2,1,3,3,4 everywhere
        //1,2,1,3,4,5 somewhere
        //1,2,3,4,5,6 nowhere

        boolean everywhere = true;
        boolean somewhere = false;

//        int numbersOfPairComparisons = numbers.length / 2 - 1;
//        int equalNumbersInPairsFound =0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == numbers[i + 2] || numbers[i + 1] == numbers[i + 3] ||
                    numbers[i] == numbers[i + 3] || numbers[i + 1] == numbers[i + 2]) {
                somewhere = true;
//                equalNumbersInPairsFound++;
            } else {
                everywhere = false;
            }
        }
        if (everywhere) {
            System.out.println("everywhere");
        } else if (somewhere) {
            System.out.println("somewhere");
        } else {
            System.out.println("nowhere");
        }
    }
}
