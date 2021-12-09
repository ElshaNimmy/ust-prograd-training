import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {

    PriorityQueue<Integer> ticketnum = new PriorityQueue<Integer>();

        ticketnum.add(11);
        ticketnum.add(12);
        ticketnum.add(15);
        ticketnum.add(14);
        ticketnum.add(18);
        ticketnum.add(13);

        System.out.println("Remove ticketnum 13 : "+ticketnum.remove(13));

        System.out.println("First ticket  :  "+ticketnum.peek());

        System.out.println(ticketnum.poll());
        System.out.println("Left of tickets are : "+ticketnum);

        System.out.println(" Ticket collection is empty? " + ticketnum.isEmpty());
}
}
