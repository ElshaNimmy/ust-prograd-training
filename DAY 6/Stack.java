import java.util.Stack;
public class Stackop {
    public static void main(String[] args) {

        // Creating a Stack
        Stack<String> cafe = new Stack<>();

        // Pushing items to the Stack
        cafe.push("Tray 1");
        cafe.push("Tray 2");
        cafe.push("Tray 3");
        cafe.push("Tray 4");

        System.out.println("Cafe is empty or not  : " + cafe.isEmpty());

        System.out.println("Trays in cafe : " + cafe);
        System.out.println();

        System.out.println("Number of trays in cafe  : " + cafe.size());

        //popping values

        String Top = cafe.pop();
        System.out.println("Top most tray: " +Top);
        System.out.println("Current updated trays:" +cafe);

        //peek values


        Top = cafe.peek();
        System.out.println("Stack peek : " + Top);
        System.out.println("Current updated cafe : " + cafe);

        int position = cafe.search("Tray 2");

        if(position != -1) {
            System.out.println("Found Tray 2 position  : " + position);
        } else {
            System.out.println("Tray not found");
        }


    }
}
