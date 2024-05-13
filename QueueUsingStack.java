package question3;
import question2.Stack;

    public class QueueUsingStack {
        private Stack stack1;
        private Stack stack2;

        public QueueUsingStack(int capacity) {
            stack1 = new Stack(capacity);
            stack2 = new Stack(capacity);
        }

        public void enqueue(int item) {
            stack1.push(item);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            if (stack2.size() == 0) {
                while (stack1.size() > 0) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            if (stack2.size() == 0) {
                while (stack1.size() > 0) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.size() == 0 && stack2.size() == 0;
        }

        public int size() {
            return stack1.size() + stack2.size();
        }

        public static void main(String[] args) {
            QueueUsingStack queue = new QueueUsingStack(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }
        }
    }
