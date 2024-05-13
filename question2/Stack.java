package question2;

public class Stack {
    int[] numArray;
    int top;
    int size;
    public Stack(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }
    public int size() {
        return size;
    }
    void push(int value) {
        if (top < numArray.length - 1) {
            numArray[++top] = value;
            size++;
        }
        else {
            System.out.println("Full");
        }
    }
    public int pop() {
        if (top >= 0) {
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }
    public static void main(String[] args) {
        Stack numStack = new Stack(5);
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.push(4);
        numStack.pop();
        for (int i = 0; i < numStack.size; i++) {
            System.out.println(numStack.numArray[i]);
        }
    }
}