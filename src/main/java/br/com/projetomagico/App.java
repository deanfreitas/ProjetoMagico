package br.com.projetomagico;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(8, 27);
        Interval interval2 = new Interval(49, 49);

        listInterval.add(interval1);
        listInterval.add(interval2);

        Magic magic = new Magic();
        int magicsNumbers = magic.executeMagic(listInterval);

        System.out.println("Has " + magicsNumbers + " Magic numbers");
    }
}
