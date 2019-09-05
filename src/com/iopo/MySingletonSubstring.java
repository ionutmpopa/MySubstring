package com.iopo;

public class MySingletonSubstring {


    private static MySingletonSubstring instance = null;

    private MySingletonSubstring() {
    }


    public static MySingletonSubstring getInstance() {

        if (instance == null) {
            instance = new MySingletonSubstring();
        }

        return instance;
    }


    public String mySubstring(String parameter1, int startingFrom, int readingLength) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[parameter1.length()];

        try {

            if (startingFrom > 0) {

                for (int i = 0; i <= stringArray.length; i++) {

                    if (i == (startingFrom + 1)) {
                        stringBuilder.append(parameter1.charAt(i - 1));

                        for (int j = i; j < (startingFrom + readingLength); j++) {
                            stringBuilder.append(parameter1.charAt(j));
                        }
                    }
                }
            } else {
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





}
