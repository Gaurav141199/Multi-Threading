
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) 
    {    
    	this.capacity = capacity ;
    	queue = new NodeBase[capacity];
    	currentSize = 0;
    }

    public int size() 
    {
    	return currentSize;		
    }

    public boolean isEmpty() 
    {
    	return currentSize==0;
    }
	
    public boolean isFull() 
    {
    	return currentSize==capacity;
    }

    public void enqueue(Node<V> node) 
    {
    	queue[currentSize] = (NodeBase<V>) node;
    	currentSize++;
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	if (isEmpty()) {
    		return null;
    	}
    	else {
    		int k=0;
    		int h =queue[0].getPriority();
    		for(int i=0; i<currentSize;i++) 
    		{
    			if(h>queue[i].getPriority()) 
    			{
        			h=queue[i].getPriority();
        			k=i; 
    			}
    		}
    		NodeBase<V> obj = queue[k];
    		for (int j=k;j<currentSize-1;j++) 
    		{
    			queue[j]=queue[j+1];
    		}
    		currentSize--;
    		return obj;
    	}
    	
    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	int apple = currentSize;
	for(int i=0; i<apple; i++) {
            this.dequeue().show();
	}
    }

}

