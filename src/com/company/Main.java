package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 3, 5, 6, 1, 2, 3, 4, 5, 2, 2, 3, 8);

        /*ArrayList<Integer> filtered = new ArrayList<>();
        for (int item : ints) {
            if (item % 2 == 0) {
                filtered.add(item);
            }
        }*/
        ArrayList<Integer> filtered = (ArrayList<Integer>) ints.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());

        ArrayList<Integer> mapped = (ArrayList<Integer>) ints.stream().map(item -> item = item * 2).collect(Collectors.toList());

        ArrayList<Integer> filteredmapped = (ArrayList<Integer>) ints.stream().filter(item -> item % 2 == 0).map(item -> item = item * 2).collect(Collectors.toList());

//        ArrayList<Integer> myfilteredmapped = (ArrayList<Integer>) ints.stream().map(item -> {
//            if (item % 2 == 0) return item = item * 2;
//            else return item;
//        }).collect(Collectors.toList());

        ArrayList<Integer> myfilteredmapped = (ArrayList<Integer>) ints.stream().map(item -> item = item % 2 == 0 ? item * 2 : item).collect(Collectors.toList());

        for (int item : ints) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : filtered) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : mapped) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : filteredmapped) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : myfilteredmapped) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
