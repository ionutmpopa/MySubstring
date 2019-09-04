package com.iopo;

import org.junit.*;

public class MySubstringTest {

    public MySubstring mySubstring;

    @Before
    public void setUp() {
        mySubstring = new MySubstring();
    }


    @Test
    public void mySubstring_Test_Panama1_1() {

        String result = mySubstring.mySubstring("Panama", 1, 1);
        Assert.assertEquals("P", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque1_2() {

        String result = mySubstring.mySubstring("Albuquerque", 1, 2);
        Assert.assertEquals("Al", result);
    }

    @Test
    public void mySubstring_Test_Panama1_3() {

        String result = mySubstring.mySubstring("Panama", 1, 3);
        Assert.assertEquals("Pan", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque1_4() {

        String result = mySubstring.mySubstring("Albuquerque", 1, 4);
        Assert.assertEquals("Albu", result);
    }

    @Test
    public void mySubstring_Test_Panama1_5() {

        String result = mySubstring.mySubstring("Panama", 1, 5);
        Assert.assertEquals("Panam", result);
    }

    @Test
    public void mySubstring_Test_Panama1_6() {

        String result = mySubstring.mySubstring("Panama", 1, 6);
        Assert.assertEquals("Panama", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_1() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 1);
        Assert.assertEquals("l", result);
    }

    @Test
    public void mySubstring_Test_Panama2_2() {

        String result = mySubstring.mySubstring("Panama", 2, 2);
        Assert.assertEquals("an", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_3() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 3);
        Assert.assertEquals("lbu", result);
    }

    @Test
    public void mySubstring_Test_Panama2_4() {

        String result = mySubstring.mySubstring("Panama", 2, 4);
        Assert.assertEquals("anam", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_5() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 5);
        Assert.assertEquals("lbuqu", result);
    }

    @Test
    public void mySubstring_Test_Panama3_1() {

        String result = mySubstring.mySubstring("Panama", 3, 1);
        Assert.assertEquals("n", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque3_2() {

        String result = mySubstring.mySubstring("Albuquerque", 3, 2);
        Assert.assertEquals("bu", result);
    }

    @Test
    public void mySubstring_Test_Panama3_3() {

        String result = mySubstring.mySubstring("Panama", 3, 3);
        Assert.assertEquals("nam", result);
    }

    @Test
    public void mySubstring_Test_Australopithecus3_4() {

        String result = mySubstring.mySubstring("Australopithecus", 3, 4);
        Assert.assertEquals("stra", result);
    }


    @Test
    public void mySubstring_Test_Panama4_1() {

        String result = mySubstring.mySubstring("Panama", 4, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Panama4_2() {

        String result = mySubstring.mySubstring("Panama", 4, 2);
        Assert.assertEquals("am", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque4_3() {

        String result = mySubstring.mySubstring("Albuquerque", 4, 3);
        Assert.assertEquals("uqu", result);
    }

    @Test
    public void mySubstring_Test_Panama5_1() {

        String result = mySubstring.mySubstring("Panama", 5, 1);
        Assert.assertEquals("m", result);
    }

    @Test
    public void mySubstring_Test_Panama5_2() {

        String result = mySubstring.mySubstring("Panama", 5, 2);
        Assert.assertEquals("ma", result);
    }

    @Test
    public void mySubstring_Test_Panama6_1() {

        String result = mySubstring.mySubstring("Panama", 6, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque10_1() {

        String result = mySubstring.mySubstring("Albuquerque", 10, 2);
        Assert.assertEquals("ue", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque11_1() {

        String result = mySubstring.mySubstring("Albuquerque", 11, 1);
        Assert.assertEquals("e", result);
    }









}