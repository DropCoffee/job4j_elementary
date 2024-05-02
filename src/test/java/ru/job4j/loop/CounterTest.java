package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class CounterTest {
    @Test
    void whenStart0Finish5Then15() {
        int start = 0;
        int finish = 5;
        double expected = 15;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenFinishLessStartThen0() {
        int start = 5;
        int finish = 1;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwoToTenThen28() {
        int start = -2;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneHundredThen2550() {
        int start = 0;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2550;
        assertThat(result).isEqualTo(expected);
    }
}