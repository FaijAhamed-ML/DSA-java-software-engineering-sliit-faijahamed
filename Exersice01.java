package lab3;

public class Exersice01 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Exersice01(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedItem = stackArray[top];
            top--;
            return poppedItem;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exersice01 myStack = new Exersice01(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.display();

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());

        myStack.display();

        System.out.println("Is stack empty? " + myStack.isEmpty());
        System.out.println("Is stack full? " + myStack.isFull());
    }
}