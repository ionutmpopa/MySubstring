package com.iopo;

public class MySubstring {


    public MySubstring() {
    }


    public String mySubstring(String parameter1, int parameter2, int parameter3) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[parameter1.length()];

        try {

            for (int i = 0; i <= stringArray.length; i++) {

                if (i == parameter2) {
                    stringBuilder.append(parameter1.charAt(i - 1));

                    for (int j = i; j < (parameter2 + parameter3) - 1; j++) {
                        stringBuilder.append(parameter1.charAt(j));
                    }
                }
            }

            return stringBuilder.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return null;
        }
    }





}
