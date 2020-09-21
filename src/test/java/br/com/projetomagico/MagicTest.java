package br.com.projetomagico;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MagicTest {

    @Test
    public void shouldAnswerWithThreeMagicNumbers() {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(8, 27);
        Interval interval2 = new Interval(49, 49);

        listInterval.add(interval1);
        listInterval.add(interval2);

        Magic magic = new Magic();
        Assert.assertEquals(magic.executeMagic(listInterval), 3);
    }

    @Test
    public void shouldAnswerWithNomeMagicNumbers() {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(2, 3);

        listInterval.add(interval1);

        Magic magic = new Magic();
        Assert.assertEquals(magic.executeMagic(listInterval), 0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithErrorFirstNegativeNumber() {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(-2, 3);

        listInterval.add(interval1);

        Magic magic = new Magic();
        magic.executeMagic(listInterval);
    }

    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithErrorSecondNegativeNumber() {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(2, -3);

        listInterval.add(interval1);

        Magic magic = new Magic();
        magic.executeMagic(listInterval);
    }

    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithErrorSecondGreaterFirst() {
        List<Interval> listInterval = new ArrayList<>();
        Interval interval1 = new Interval(3, 2);

        listInterval.add(interval1);

        Magic magic = new Magic();
        magic.executeMagic(listInterval);
    }

    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithErrorEmpty() {
        List<Interval> listInterval = new ArrayList<>();

        Magic magic = new Magic();
        magic.executeMagic(listInterval);
    }

    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithErrorNull() {
        Magic magic = new Magic();
        magic.executeMagic(null);
    }
}
