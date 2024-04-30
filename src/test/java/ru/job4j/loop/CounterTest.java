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
}