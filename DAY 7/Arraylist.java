import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class Arraylist {


       

    public static void main(String[] args) {
        ArrayList<String> student1 =  new ArrayList<>(20);
        ArrayList<String> student2= new ArrayList<String>(List.of("stud5","stud6","stud7"));
        //Adding Names to ArrayList
        student1.add("stud1");
        student1.add("stud2");
        student1.add("stud3");
        student1.add("stud9");
        System.out.println("Check that students are in class or not:");
        System.out.println(student1.isEmpty());
        System.out.println("Attendence of Monday : " +student1);
        student1.set(3, "stud4");
        student1.addAll(student2);
        System.out.println("Attendence of Friday:" +student1);
        System.out.println(student1.contains("stud5"));
        System.out.println("Get 5th student :");
        System.out.println(student1.get(4));
        System.out.println("Remove last student students");
        System.out.println(student1.remove(6));
        System.out.println("Attendence of Tuesday : " +student1);
        System.out.println("position of stud6 in class:");
        System.out.println(student1.indexOf("stud6"));
        Collections.sort(student1);
        System.out.println("Sorted list of students :" +student1);
        System.out.println("Final strength of class : " +student1);
        System.out.println(student1.size());
        student1.clear();
        System.out.println("Attendence of sunday :"student1);

    }
}
