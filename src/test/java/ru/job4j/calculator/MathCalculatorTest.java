package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class MathCalculatorTest {

    @Test
    void whenFirst10Second20ThenSumAndMultiply230() {
        double expected = 230;
        double first = 10;
        double second = 20;
        double result = MathCalculator.sumAndMultiply(first, second);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}