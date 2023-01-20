import java.util.Scanner;
import java.util.*;

/**
 * Header page for Queue and Orders class. Includes necessary methods
 *
 * @author Zack Tram
 * @version 11/16/22
 */

// Creates Node class and its constructor/variables
class Node
{
    public int orderNumber; 
    public String orderName;
    public String item;
    public double orderTotal;
    public Node next;
    
    public Node (int orderNumber, String orderName, String item, double orderTotal)
    {
        this.orderName = orderName;
        this.orderNumber = orderNumber;
        this.item = item;
        this.orderTotal = orderTotal;
        this.next = null;
      
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }
    
    public String getOrderName()
    {
        return orderName;
    }
    
    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }
    
    public String getItem()
    {
        return item;
    }
    
    public void setItem(String item)
    {
        this.item = item;
    }
    
    public double getOrderTotal()
    {
        return orderTotal;
    }
    
    public void setOrderTotal(double orderTotal)
    {
        this.orderTotal = orderTotal;
    }   
 
    
    
    
}


   
          
    

