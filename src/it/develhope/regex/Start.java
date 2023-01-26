package it.develhope.regex;

public class Start {

    public static void main(String[] args) {

        System.out.println("-----------Starting-------------------");

        String s1 = "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println(s1.replaceAll("\s+are", "_XYZ"));

        System.out.println("--------------------------------------");

    }

}
