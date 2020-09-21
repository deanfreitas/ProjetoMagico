package br.com.projetomagico;

import java.util.ArrayList;
import java.util.List;

import static br.com.projetomagico.Utils.*;

public class Magic {

    public int executeMagic(List<Interval> listInterval) {

        if (listInterval == null || listInterval.isEmpty()) {
            throw new RuntimeException("Invalid list");
        }

        List<Integer> integers = new ArrayList<>();

        listInterval.forEach(interval -> {
            if (isNegativeNumber(interval.getStart()) || isNegativeNumber(interval.getEnd())) {
                throw new RuntimeException("The numbers need to be positive");
            }

            if (!isEndGreaterStart(interval)) {
                throw new RuntimeException("The end number need greater start number");
            }

            integers.addAll(checkIntervalIsMagic(interval));
        });

        return integers.size();
    }

    private List<Integer> checkIntervalIsMagic(Interval interval) {
        List<Integer> numbersMagic = new ArrayList<>();

        for (int i = interval.getStart(); i <= interval.getEnd(); i++) {
            if (isSquareRootValidEndPrime(i)) {
                numbersMagic.add(i);
            }
        }

        return numbersMagic;
    }
}
