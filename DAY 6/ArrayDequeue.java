import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {

        Deque<Integer> ticketnum = new ArrayDeque(20);
        ticketnum.add(10);
        ticketnum.add(12);
        ticketnum.add(11);
        ticketnum.add(13);
        System.out.println("First ticketnumber is" + ticketnum.peek());
        System.out.println("Last ticketnumber is" + ticketnum.peekLast());

        System.out.println("Order of tickets: ");
        int i=1;
        for (Integer n : ticketnum) {
            System.out.println("Ticket "+i+" ->"+n);
            i++;
        }

        // Retrieve the first element of the deque.
        System.out.println("Retrieve the first Ticket: " + ticketnum.getFirst());

        System.out.println("Remove First ticket : "+ ticketnum.poll());
        System.out.println("Remove ticketnum 11 :"+ticketnum.remove(11));
        System.out.println(ticketnum);
    }
}
