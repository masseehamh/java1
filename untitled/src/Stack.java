public class Stack {
    int stack[]=new int[5];
    int top=-1;

    void push(int data)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value=stack[top];
        return value;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(30);
        s.display();
        s.push(60);
        System.out.println("removed"+s.pop());
        s.display();
        System.out.println("Top element is"+s.peek());

    }
}
