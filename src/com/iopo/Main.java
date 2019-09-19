package com.iopo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        MySingletonSubstring mySubstringInstance = MySingletonSubstring.getInstance();

        String result1 = mySubstringInstance.mySubstring("Australopithecus", 8, 8);
        String result = mySubstringInstance.mySubstring("Australopithecus", -8, 8);
        String resultt = mySubstringInstance.mySubstring("Australopithecus", 8);

        String javaResult = "Australopithecus";

        System.out.println(result1);
        System.out.println(result);
        System.out.println(javaResult.substring(8, 16));
        System.out.println(resultt);

        MySubstring mySubstring = new MySubstring();

        Integer result2 = mySubstring.mySubstring(123456, 3, 3);

        Integer result3 = mySubstring.mySubstring(123456, -3, 3);
        String result4 = "123456".substring(3, 6);
        Integer result5 = mySubstring.mySubstring(123456, 0, 2);
        Integer result6 = mySubstring.mySubstring(123456, 2, 5);
        Integer result7 = mySubstring.mySubstring(123456, 2, 4);




        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

        System.out.println(mySubstring.mySubstring("There's no way I will do that!", 4, 10));
        System.out.println(mySubstring.mySubstring("There's no way I will do that!", -15, 15));
        System.out.println(mySubstring.mySubstring("There's no way I will do that!", -15));
    }
}
