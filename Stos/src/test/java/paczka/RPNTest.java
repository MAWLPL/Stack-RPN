package paczka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPNTest {

    private RPN calculator;

    @BeforeEach
    public void setUp() {
        calculator = new RPN();
    }

    @Test
    public void testSimpleAddition() {
        assertEquals(7, calculator.evaluate("3 4 +"), "Wynik dla '3 4 +' powinien być 7");
    }

    @Test
    public void testComplexExpression() {
        assertEquals(14, calculator.evaluate("3 4 + 2 *"), "Wynik dla '3 4 + 2 *' powinien być 14");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.evaluate("5 4 -"), "Wynik dla '5 4 -' powinien być 1");
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.evaluate("8 4 /"), "Wynik dla '8 4 /' powinien być 2");
    }

    @Test
    public void testSingleNumber() {
        assertEquals(42, calculator.evaluate("42"), "Wynik dla '42' powinien być 42");
    }

    @Test
    public void testEmptyExpression() {
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluate(""), "Pusta ekspresja powinna rzucić wyjątek");
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluate("5 4 &"), "Nieznany operator '&' powinien rzucić wyjątek");
    }
}