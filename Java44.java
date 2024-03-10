import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> queueList;

    // Constructor to initialize the queue
    public Queue() {
        queueList = new LinkedList<>();
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int element) {
        queueList.addLast(element);
        System.out.println("Enqueued: " + element);
    }

    // Method to remove an element from the queue (dequeue)
    public void dequeue() {
        if (!isEmpty()) {
            int removedElement = queueList.removeFirst();
            System.out.println("Dequeued: " + removedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return queueList.size();
    }
}

public class Java44 {
    public static void main(String[] args) {
        // Creating a queue
        Queue myQueue = new Queue();

        // Enqueueing elements
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        // Dequeueing elements
        myQueue.dequeue();
        myQueue.dequeue();

        // Checking size and emptiness
        System.out.println("Current size of the queue: " + myQueue.size());
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
    }
}