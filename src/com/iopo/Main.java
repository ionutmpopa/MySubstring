package com.iopo;

public class Main {

    public static void main(String[] args) {


        MySingletonSubstring mySubstringInstance = MySingletonSubstring.getInstance();


        String result = mySubstringInstance.mySubstring("Australopithecus", 1, 3);

        System.out.println(result);

        MySubstring mySubstring = new MySubstring();

        Integer result2 = mySubstring.mySubstring(123456, 6, 1);

        System.out.println(result2);

    }
}
