import java.util.Queue;

public class Main {
    public static void main(String[] args) {
// Create a queue and initialize front and rear
        Solution.Queue q = new Solution.Queue();
        q.front = q.rear = null;

        // Inserting elements in Circular Queue
        Solution.enQueue(q, 14);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, 6);

        // Display elements present in Circular Queue
        Solution.displayQueue(q);

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", Solution.deQueue(q));
        System.out.printf(" Deleted value = %d", Solution.deQueue(q));

        // Remaining elements in Circular Queue
        Solution.displayQueue(q);

        Solution.enQueue(q, 9);
        Solution.enQueue(q, 20);
        Solution.displayQueue(q);
    }
}
