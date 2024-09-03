package se.iths.Lektion;

import java.nio.charset.StandardCharsets;

public class Variables{

    public static void main(String[] args) {
        int variableValue =10;
        int maxValue =2_147_483_647;

        System.out.println(variableValue);
       variableValue = variableValue + 1;
       System.out.println(variableValue);

       char kebabCase = 'A';
    System.out.println(kebabCase);
    kebabCase = (char)(kebabCase + 1);
    System.out.println(kebabCase);

    String text = "=) =) =)";
    System.out.println(text);

    String heart = "❤";
    System.out.println(heart.getBytes(StandardCharsets.UTF_8).length);

    double length = 1.86;
    System.out.println(length);

    float pi = 3.14f;
    System.out.println(pi);

    float dollar = 0.1f;
    System.out.println(dollar);
System.out.printf("%.10f \n",dollar);

int maxInteger = Integer.MAX_VALUE;
System.out.println("maxInteger:"  + maxInteger);
float maxFloat = maxInteger;
System.out.println("maxFloat:"  + maxFloat);

float findTheGap = 16777218.0f;
System.out.println(findTheGap);


    }
}
