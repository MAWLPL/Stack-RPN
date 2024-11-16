package paczka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void testPush1() {
        stack.push("A");
        assertEquals("A", stack.peek(), "Elementem powinno być 'A'.");
    }

    @Test
    void testPush2() {
        stack.push("B");
        assertEquals("B", stack.peek(), "Elementem powinno być 'A'.");
    }

    @Test
    public void testPushNull() {
        stack.push(null);
        assertNull(stack.peek(), "Powinien być null.");
    }

    @Test
    void testPop1() {
        stack.push("A");
        assertEquals("A", stack.pop(), "Usuniętym elementem powinno być 'A'.");
    }

    @Test
    void testPop2() {
        stack.push("B");
        assertEquals("B", stack.pop(), "Usuniętym elementem powinno być 'B'.");
    }

    @Test
    void testPopEmpty() {
        assertNull(stack.pop(), "Usunięcie elementu z pustego stosu powinno zwrócić null.");
    }

    @Test
    void testPeek1() {
        stack.push("A");
        assertEquals("A", stack.peek(), "Powinno zostać zwrócone 'A'.");
    }

    @Test
    void testPeek2() {
        stack.push("B");
        assertEquals("B", stack.peek(), "Powinno zostać zwrócone 'B'.");
    }

    @Test
    public void testPeekEmpty() {
        assertNull(stack.peek(), "Zwrot elementu z pustego stosu powinno zwrócić null.");
    }
}
