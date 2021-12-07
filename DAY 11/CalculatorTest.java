import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public Calculator calculate;
    
    @Nested
    class TestingAddFunction {
        @BeforeEach
        public void setCalc() {
            calculate = new Calculator();
        }

        @Test
        public void FiveAddEightIsEight() {

            double answer = calculate.add(5, 3);
            double expected = 8;
            assertEquals(answer, expected);
        }

        @Test
        public void FiveAddFiveIsTen() {
            double answer = calculate.add(5, 5);
            double expected = 10;
            assertEquals(answer, expected);
        }

        @Test
        public void FiveAddZeroIsFive() {
            double answer = calculate.add(5, 0);
            double expected = 5;
            assertEquals(answer, expected);
        }
    }


    @Nested
   class TestingSubFunction {
        @BeforeEach
        public void setCalc() {
            calculate = new Calculator();
        }

        @Test
        public void FiveMinusThreeIsTwo() {
            double answer = calculate.sub(5, 3);
            double expected = 2;
            assertEquals(answer, expected);
        }

        @Test
        public void FiveMinusFiveIsZero() {
            double answer = calculate.sub(5, 5);
            double expected = 0;
           assertEquals(answer, expected);
        }

        @Test
        public void ThreeMinusFiveIsNegativeTwo() {
            double answer = calculate.sub(3, 5);
            double expected = -2;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingDivFunction {
        @BeforeEach
        public void setCalc() {
            calculate = new Calculator();
        }

        @Test
        public void FiveDivOneIsFive() {
            double answer = calculate.div(5, 1);
            double expected = 5;
            assertEquals(answer, expected);
        }

        @Test
        public void FiveDivFiveIsOne() {
            double answer = calculate.div(5, 5);
            double expected = 1;
            assertEquals(answer, expected);
        }

        @Test
        public void throwsExceptionWhenDividedByZero() {
            assertThrows(ArithmeticException.class, () -> calculate.div(5, 0));
        }
    }
}