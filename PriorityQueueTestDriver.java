// Use this driver for the testing the correctness of your priority queue implementation
// You can change the add, remove sequence to test for various scenarios.
public class PriorityQueueTestDriver {
    public static void main(String[] args) {
	Queue<String> pq = new Queue<String>(5);
	pq.enqueue(new Node<String>(4, "A"));
	pq.enqueue(new Node<String>(10, "B"));
	pq.enqueue(new Node<String>(3, "C"));
	pq.enqueue(new Node<String>(5, "E"));
	pq.enqueue(new Node<String>(2, "F"));
	
	//pq.display();
	pq.display();

    }
}
