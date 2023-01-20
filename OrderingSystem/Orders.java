import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Write a description of class Orders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orders
{
    static int orderCount = 0;
    
    /*  newOrder - creates a new order 
     * 
     *  @param queue - the queue that the order should be added to 
     */
    
    public static Node newOrder(Queue queue)
    {
        Scanner scnr = new Scanner(System.in);  
        double orderTotal = 0;
        String item = "";
        orderCount++;
        
        System.out.println("");
        System.out.println("Enter a name for the order");
        String orderName = scnr.next();
        
        System.out.println("");
        System.out.println("Select one item");
        System.out.println("=============================");
        System.out.println("Enter 1 for Pizza - $10.99");
        System.out.println("Enter 2 for Hot Dog - $4.99");
        System.out.println("Enter 3 for Salad - $6.99");
        System.out.println("");
        
        int menuChoice = scnr.nextInt();
      
            switch(menuChoice)
        {
            case 1:
                orderTotal = 10.99;
                item = "Pizza";
                break;
            case 2:
                orderTotal = 4.99;
                item = "Hot Dog";
                break;
            case 3:
                orderTotal = 6.99;
                item = "Salad";
                break;               
                
        }   
        
        Node order = new Node(orderCount, orderName, item, orderTotal);
        System.out.println("Order added!");
        System.out.println("Order number: " + orderCount);
        System.out.println("Order Details: " + orderName + ", " + item + ", " + orderTotal);
        System.out.println("");
        return order;
    }
    
    
}
