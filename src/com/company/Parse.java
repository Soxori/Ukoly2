package com.company;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej text");
        String text = sc.nextLine();

        text = text.replaceAll("[^0-9]", "");

        int numbers = Integer.parseInt(text);
        System.out.println(numbers);

    }
}
