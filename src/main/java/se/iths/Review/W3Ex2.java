package se.iths.Review;

import java.util.Arrays;

public class W3Ex2 {
    public static void main(String[] args){
        String[] inArray = {"1", "2", "3", "4"};
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 0)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 1)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 2)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 3)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 4)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, -1)));

        System.out.println(Arrays.toString(copyWithExclusion(inArray, "2")));
    }

    public static String[] copyWithExclusion(String[] org, String exclusionString) {
        return copyWithExclusion(org, 2);
        //return org;
    }

    public static String[] copyWithExclusion(String[] org, int exclusionIndex){

        if (exclusionIndex >= org.length || exclusionIndex < 0 || org == null || org.length == 0){
            return org;
        }

    String[] tempArray = new String[org.length -1];
    int j = 0;

    for (int i = 0; i < tempArray.length; i++){
        if(i != exclusionIndex){
            tempArray[j++] = org[i];
        }
    }
    return tempArray;
    }
}
