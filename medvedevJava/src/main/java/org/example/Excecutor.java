package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Excecutor {
    private final String MAIN_NAME = "Vyacheslav";
    private int number;
    private String name;

    public void isSeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say number :");
        try {
            number = scanner.nextInt();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
        scanner.close();
        if (number > 7) {
            System.out.println("Hello");
        }
    }


    public void isVyacheslav() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Say name :");
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        if (Objects.equals(name, MAIN_NAME)) {
            System.out.println("Hello, " + MAIN_NAME);
        } else {
            System.out.println("There is no such name");
        }
    }

    public ArrayList<Integer> getMultiplesOfThree(ArrayList<Integer> list) {
        list.removeIf(num -> num % 3 != 0);
        return list;
    }
}
