package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("enter the url: ");
        String url=scn.nextLine();

        ParseUrl parser=new ParseUrl();
        parser.parse(url);
        System.out.println(parser);
    }
}
