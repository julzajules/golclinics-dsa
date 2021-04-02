import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

java.util.*;

public class loopinarray<ListNode>{

    //declare the linkedlist
    LinkedList<ListNode> List = new LinkedList<ListNode>();

    //condition to check if the list is empty
    while (List.hasNext()) {
        //rabbit and tortoise contain the head
        ListNode rabbit  = List.getFirst();
        ListNode tortoise = List.getFirst();

        if ((rabbit != null) && (tortoise != null)) {
            //navigate through the list using an iterator
            Iterator itr = List.listIterator();
            // returns a list-iterator of the elements in proper sequence 
            while (itr.hasNext()) {
                if((itr.next() != null) && (itr.next().next() != null)) {
                    rabbit = (ListNode) ((Iterator) itr.next().next();
                    //returns the next element in the iterator
                    tortoise = (ListNode) itr.next();
    
                    if(rabbit == tortoise)
                       System.out.println("List has cycle");
                }
            }
        }
    }

    public static void main (String [] args) <ListNode>{
       
    } 
}