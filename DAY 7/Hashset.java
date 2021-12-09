import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Dem {
    public static void main(String[] args) {
        HashSet<Integer> mark=new HashSet<>();
        mark.add(40);
        mark.add(20);
        mark.add(42);
        mark.addAll(List.of(45,50));
        System.out.println("Total number of subjects : " + mark.size());
        System.out.print("Displaying the marks of subjects :"+ mark);
        System.out.println("\n");
        System.out.println(" Does the student score 40 marks in any subject : " + mark.contains(40));
        int i=1;
        for (Iterator<Integer> it = mark.iterator(); it.hasNext(); ) {
            System.out.println(" Mark "+ i + " : " + it.next());
            i++;
        }
        mark.clear();
        System.out.println("Cleared marksheet :"+ mark);
    }
}
