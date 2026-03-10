package lab3;

import java.util.Scanner;
public class Exersice02 {
    // 1. The Stack class modified to hold characters (char) instead of integers
    static class CharStack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public CharStack(int size) {
            this.maxSize = size;
            this.stackArray = new char[maxSize];
            this.top = -1;
        }

        public void push(char item) {
            top++;
            stackArray[top] = item;
        }

        public char pop() {
            char poppedItem = stackArray[top];
            top--;
            return poppedItem;
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        CharStack stack = new CharStack(input.length());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            System.out.print(ch);
        }

        System.out.println();
    }
}
