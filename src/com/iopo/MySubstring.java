package com.iopo;

public class MySubstring {


    public MySubstring() {
    }

    //takes a String value as the input parameter.
    public String mySubstring(String parameter1, int startingFrom, int readingLength) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[parameter1.length()];

        try {
            //starts reading from left to right
            if (startingFrom >= 0) {
                for (int i = 0; i <= stringArray.length; i++) {
                    if (i == (startingFrom + 1)) {
                        stringBuilder.append(parameter1.charAt(i - 1));
                        for (int j = i; j < (startingFrom + readingLength); j++) {
                            stringBuilder.append(parameter1.charAt(j));
                        }
                    }
                }
            } else {
                //starts reading from right to left
                for (int i = stringArray.length; i > 0; i--) {
                    if (i == (stringArray.length + startingFrom) + 1) {
                        stringBuilder.append(parameter1.charAt(i - 1));
                        for (int j = i; j < ((stringArray.length + startingFrom) + readingLength); j++) {
                            stringBuilder.append(parameter1.charAt(j));
                        }
                    }
                }
            }
            return stringBuilder.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return null;
        }
    }

    //takes an int or Integer value as the input parameter.
    public Integer mySubstring(Integer parameter1, Integer startingFrom, Integer readingLength) {

        String convertedInt = Integer.toString(parameter1);
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[convertedInt.length()];

        try {
            //starts reading from left to right
            if (startingFrom >= 0) {
                for (int i = 0; i <= stringArray.length; i++) {
                    if (i == (startingFrom + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < (startingFrom + readingLength); j++) {
                            stringBuilder.append(convertedInt.charAt(j));
                        }
                    }
                }
            } else {
                //starts reading from right to left
                for (int i = stringArray.length; i > 0; i--) {
                    if (i == ((stringArray.length + startingFrom) + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < ((stringArray.length + startingFrom) + readingLength); j++) {
                            stringBuilder.append(convertedInt.charAt(j));
                        }
                    }
                }
            }
            Integer myResult = Integer.valueOf(stringBuilder.toString());
            return myResult;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return 0;
        }
    }
}
