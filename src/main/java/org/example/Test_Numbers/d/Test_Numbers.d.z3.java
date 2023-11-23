package org.example.Test_Numbers.d.z3;


    import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import hw.NumbersUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestUnit_test_Numbers {
        // HW 3.1. Нужно покрыть тестами метод на 100%
        // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
        Unit_test_Numbers  = new Unit_test_Numbers();
        ;
        int[] oddNumbers = new int[]{-1, 1, 5};
        int[] evenNumbers = new int[]{-2, 0, 2};

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
        void isOdd(int number) {
            assertThat(utils.evenOddNumber(number)).isFalse();
        }

        @ParameterizedTest
        @ValueSource(ints = {0, 2, 10, -4, 20, Integer.MIN_VALUE})
        void isEven(int number) {
            assertThat(utils.evenOddNumber(number)).isTrue();
        }

        // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%
        @ParameterizedTest
        @ValueSource(ints = {25, 50, 100})
        void isInsideInterval(int number) {
            assertThat(utils.isInInterval(number)).isTrue();
        }
        @ParameterizedTest
        @ValueSource(ints = {1, 24, 101, 125})
        void isOutsideInterval(int number) {
            assertThat(utils.isInInterval(number)).isFalse();
        }

    }
}
