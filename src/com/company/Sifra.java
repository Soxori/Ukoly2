package com.company;

import java.util.Scanner;

public class Sifra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej slovo");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i+=2) {
             char x = text.charAt(i);
             System.out.print(x);
        }
    }
}
