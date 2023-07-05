package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Excecutor excecutor = new Excecutor();

//        excecutor.isSeven();

//        excecutor.isVyacheslav();

        ArrayList<Integer> listOfNumbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        listOfNumbers = excecutor.getMultiplesOfThree(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}