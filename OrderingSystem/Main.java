import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * This application simulates a restaurant ordering system
 *
 * @author Zack Tram
 * @version (a version number or a date)
 */
public class Main
{
    static Queue queue = new Queue();
    static boolean done = false;
        
     public static void main (String[] args)
    {        
        // Creating a menu to allow for user input
        while(!done)
        {
            
            try{
                System.out.println("Enter 1 for new order");
                System.out.println("Enter 2 for order search");
                System.out.println("Enter 3 for order queue");
                System.out.println("Enter 4 to complete the order at the front of the queue");
                System.out.println("Enter 5 to exit");
                
                Scanner user = new Scanner(System.in);
                int menuSelect = user.nextInt();
                
                switch(menuSelect)
                {
                    case 1:
                        queue.enqueue(Orders.newOrder(queue));
                        break;                    
                    case 2:
                        System.out.println("");
                        System.out.println("Enter the order number you are searching for");
                        int key = user.nextInt();
                        System.out.println(Queue.orderSearch(key));
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Current Queue");
                        System.out.println("==============");
                        Queue.printQueue();  
                        System.out.println("");
                        break;   
                    case 4:
                        Queue.dequeue();
                        System.out.println("");
                        System.out.println("Order in the front of queue has been removed");
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Exiting");
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid. Try Again");
                        System.out.println("");
                        break;
                }
                
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid. Try Again");
                System.out.println("");
            }
            
            
        }
      
    
    }

 
}
