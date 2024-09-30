package se.iths.Week2;

public class Ex3 {
    //Todo: Skriv en statisk metod som kan avgöra om en textsträng är ett palindrom
    //Todo: Namnge metoden till isPalindrome
    //Todo: Gör också en överlagrad/overloaded metod som tar en int som inparameter och i övrigt fungerar likadant

    public static void main(String[] args) {
        System.out.println(isPalindrome("boolean"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("saippuakivikauppias"));
        System.out.println(isPalindrome("1221"));
        System.out.println(isPalindrome("Tattarrattat"));
        System.out.println(isPalindrome("333"));
        System.out.println(isPalindrome("454"));
        System.out.println(isPalindrome("221"));
    }
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String input) {
        StringBuilder palindrome = new StringBuilder(input);
        return isPalindrome(String.valueOf(palindrome.reverse().toString().equalsIgnoreCase(input)));
    }
    public static boolean isPalindrome3(int input) {
        return isPalindrome(String.valueOf(input));
    }
}
