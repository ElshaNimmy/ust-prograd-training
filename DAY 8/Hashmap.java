import java.util.HashMap;
import java.util.Map;

public class Numberlist {
    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<Integer, String>();

        numbers.put(1, " One");
        numbers.put(2, " Two");
        numbers.put(3, " Three");
        numbers.put(4, " Four");
        numbers.put(5, " Five");
        System.out.println("Display numbers in dighits and letters : " + numbers);


        System.out.println("\nLetters of dight 5 " + numbers.get(5));
        System.out.println("\nIs list  empty or not :  " + numbers.isEmpty());

        numbers.remove(3);

        System.out.println("\nDisplay survey list except dight 3  : " + numbers);
        System.out.println("\nSize of the list: " + numbers.size());
        System.out.println("Dight 3 is present or not : " + numbers.putIfAbsent(3,"Three"));

        System.out.println("\n******* Searching for  keys or values ******** \n");

        if (numbers.containsKey(5)) {

            System.out.println("Dight five is present");

        } else {

            System.out.println("NOt present");

        }

    }
}

