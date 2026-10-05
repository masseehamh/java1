package Demo1;

public class Sample2 {

    static int stack[] = new int[5];
    static int top = -1;

    // Push an element into the stack
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Full");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Remove and return the top element
    static int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

    // Return the top element without removing it
    static int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    // Display stack elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        // Push elements
        push(10);
        push(20);
        push(30);
        push(40);

        // Display stack
        display();

        // Peek top element
        System.out.println("Top element: " + peek());

        // Pop elements
        System.out.println("Popped element: " + pop());
        System.out.println("Popped element: " + pop());

        // Display after pop
        display();

        // Peek again
        System.out.println("Top element: " + peek());
    }
}

