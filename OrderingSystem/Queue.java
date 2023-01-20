
/**
 * Write a description of class Queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Queue
{
    private static Node front;
    private static Node rear;
    private static int size;
    
    //Checks the queue if it is empty
    public boolean isEmpty()
    {
        boolean empty = false;
        if (size == 0)
        {
            empty = true;
            return empty;
        }
        else
        {
            return empty;
        }
    }
    
    /*  enqueue - adds a node to the end of the queue
     * 
     *  @param newNode - the new node that is to be added to the end of the queue
     */
    public void enqueue(Node newNode)
    {
        Node node = newNode;
        if (front == null)
        {
            rear = node;
            front = node;
        }
        else
        {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }
    
    // Removes and returns the node at the front of the queue
    public static Node dequeue()
    {
        Node node = null;
        if(front != null)
        {
            if(front.getNext() != null)
            {
                node = new Node(front.getOrderNumber(), front.getOrderName(), front.getItem(), front.getOrderTotal());
                front = front.getNext();
                size--;
            }
            else
            {
                node = new Node(front.getOrderNumber(), front.getOrderName(), front.getItem(), front.getOrderTotal());
                front = null;
                rear = null;
                size--;
            }
        }
        return node;
    }
    
    public Node peek()
    {
        Node node = null;
        
        if(!isEmpty())
        {
            node = new Node(front.getOrderNumber(), front.getOrderName(), front.getItem(), front.getOrderTotal());
        }
        return node;
    }
    
    // Returns the size of the queue
    public int getSize()
    {
        return size;
    }
    
    // Prints the orderNumber and orderName of each node in the queue
    public static void printQueue()
    {
        Node node = front;
        while (node != null)
        {   
            if (node.next == null)
            {
                System.out.print(node.orderNumber + ". " + node.orderName);
                break;
            }
            else
            {
                System.out.println(node.orderNumber + ". " + node.orderName);
                node = node.next;
            }
            
        }
        System.out.println();
    }
    
    /*  orderSearch - searches for the node with the matchting key that is given
     * 
     *  @param key - the orderNumber the user is searching for
     */ 
    public static String orderSearch(int key)
    {
        Node currNode = front;
        while (currNode != null)
        {
            if (currNode.orderNumber == key)
            {
                return currNode.orderName + " - " + currNode.item;
            }
            currNode = currNode.next;
        }
        return null;
    }
    
    // Queue constructor
    public Queue()
    {
        front = null; 
        rear = null;
        size = 0;
    }
}
