package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1x0yTo0x0yThen1() {
        double expected = 1;
        Point a = new Point(-1, 0);
        Point b = new Point(0, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2xMinus2yTo0x0yThen2Dot82() {
        double expected = 2.82;
        Point a = new Point(-2, -2);
        Point b = new Point(0, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000To111Then1Dot73() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}