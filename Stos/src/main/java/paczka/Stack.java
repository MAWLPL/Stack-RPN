package paczka;

public class Stack {
    private String[] stackArray;
    private int top;

    public Stack() {
        stackArray = new String[100];
        top = 0;
    }

    public void push(String element) {
        stackArray[++top] = element;
    }

    public String pop() {
        if (top < 1) {
            System.out.println("Stos jest pusty.");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    public String peek() {
        if (top < 1) {
            System.out.println("Stos jest pusty.");
            return null;
        } else {
            return stackArray[top];
        }
    }
}
