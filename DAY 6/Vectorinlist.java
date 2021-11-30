import java.util.Iterator;
import java.util.Vector;
public class Vectorcoll {
    public static void main(String[] args) {
        Vector<String> zoo = new Vector<>(10);
        zoo.add("Tiger");
        zoo.add("Lion");
        zoo.add("Zebra");

        System.out.println("\"First Animal :\"");
        System.out.println(zoo.firstElement());
        System.out.println("\"Last Animal :\"");
        System.out.println(zoo.lastElement());
        zoo.removeElement("Zebra");
        System.out.println("Size :" + zoo.size());

        zoo.forEach(ter -> System.out.println(ter));

        System.out.println("         ");
        zoo.addElement("Peacock");
        for (Iterator<String> it = zoo.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }


    }


}
