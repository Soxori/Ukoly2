package com.company;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej slovo");
        String text = sc.nextLine();

        text = text.replaceAll("\\D+","");

        System.out.println(text);
    }
}
