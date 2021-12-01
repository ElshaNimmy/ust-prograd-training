import java.util.LinkedList;
import java.util.ListIterator;

  class Linkedlist {
    public static void main(String args[]) {


        LinkedList<String> train = new LinkedList<String>();


        train.add("comp A");
        train.add("comp B");
        train.add("comp C");
        train.add("comp D ");
        System.out.println("Display the connection : " +train);


        train.add(2, "compB1");
        train.add(3, "compB2");
        System.out.println("Display after updating: " +train);


        train.addFirst("compA1");
        train.addLast("compD5");
        System.out.println("Updated " +train);


        Object firstpos = train.get(0);
        System.out.println("First Item: " +firstpos);
        train.set(0, "compA0");
        System.out.println("  after updating first Item: " +train);

    }
}
