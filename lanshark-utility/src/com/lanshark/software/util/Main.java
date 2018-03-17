package com.lanshark.software.util;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("This .jar is not meant to be executable.");
        System.out.println("Please include this .jar in your project dependencies to use utilize its functionality");

        MutablePair<String, String> pair = new MutablePair<>("Test", "value");
        System.out.println(pair);
        pair.setValue("new value");
        System.out.println(pair);
    }

}
