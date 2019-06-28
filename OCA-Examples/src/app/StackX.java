// Stack.java
// demonstrates stacks
package app;

class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    // put item
    public void push(int data) {
        stackArray[++top] = data;
    }

    // remove
    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StackX stackX = new StackX(10);
        stackX.push(10);
        stackX.push(20);
        while (!stackX.isEmpty()) {
            int value = stackX.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
/**
 * Unit tests the {@code stack} data type
 */
