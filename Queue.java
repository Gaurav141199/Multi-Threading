

// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    public int capacity, currentSize, front, rear;
    public Queue(int capacity) {    
    	queue =  new NodeBase[capacity];
    	this.capacity = capacity;
    	front =-1;
    	rear =  -1;
    	currentSize=0;
    }

    public int size() {
    	return currentSize;
    }

    public boolean isEmpty() {
    	return currentSize==0;
    }
	
    public boolean isFull() {
    	return (currentSize == capacity);
    }

    public void enqueue(Node<V> node) {
         
            rear = (rear + 1) % queue.length;
            queue[rear] = (NodeBase<V>)node;
            currentSize++;
            
            if (front == -1) {
				front = rear;
			}
              
    }

    public NodeBase<V> dequeue() {
    	NodeBase<V> deQueuedElement;
        if (isEmpty()) {
            return null;
        }
        else {
            deQueuedElement = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            currentSize--;
        }
        return deQueuedElement;
    }
    
    
    
    public void display() {
    	int b = currentSize;
    	for(int i = 0; i<b;i++) {
    		dequeue().show();
    	}
    }

}

