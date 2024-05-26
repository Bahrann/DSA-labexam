//3

public class test3 {
    private int[] queue;
    private int front, rear, size, capacity;

    public test3(int k) {
        capacity = k;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (size == capacity) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int result = queue[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    public int frontValue() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int rearValue() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        test3 q = new test3 (3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.frontValue());
        System.out.println(q.rearValue());
    }
}
