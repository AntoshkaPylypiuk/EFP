package ua.lv.pylypiuk.anton.EFP4;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EFPfirstThree {

        public static void main(String[] args) {

            ArrayList<Integer> itemList = new ArrayList<>();
            itemList.add(1);
            itemList.add(9);
            itemList.add(5);
            itemList.add(4);
            itemList.add(2);
            itemList.add(3);
            itemList.add(8);
            itemList.add(6);
            itemList.add(10);
            itemList.add(0);

            System.out.println(itemList.stream().map(item -> item * item).reduce(0, (x, y) -> x + y));

            Stream.of(1, 7, 9, 2, 4, 6).filter(integer -> integer % 2 == 0).forEach(System.out::println);

            Stream.of("James", "Clinton", "Williams", "Jonathan").filter(s -> s.contains("J")).forEach(System.out::println);
        }
    }
