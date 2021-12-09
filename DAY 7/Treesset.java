import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;


public class Dem {
    public static void main(String[] args) {
        TreeSet<String> teamplayers=new TreeSet<>();
        teamplayers.add("Anirudh");
        teamplayers.addAll(List.of("Messi","Virat","Beem singh"));
        System.out.println("Total number of players: " + teamplayers.size());
        System.out.println("Order of players are : "+ teamplayers);
        System.out.println("First player name :"+ teamplayers.first());
       // TreeSet<String> players=(TreeSet<String>)teamplayers.subSet("Rehna","Reenu");
        teamplayers.addAll(List.of("Rehna","Reenu"));
        System.out.println("Updated Player list are:" + teamplayers );
        teamplayers.clear();
        System.out.println("Cleared List :"+ teamplayers);
    }
}