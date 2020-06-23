package Lesson;
import java.util.*;

public class Lesson {
    public static Integer printItem(ArrayList<Integer> myList){
          System.out.println(myList.get(1));
          return myList.get(1);
    }
    public static void main(String[] args){
         ArrayList<Integer> integerList = new ArrayList<>();
         //Values are added into ArrayList.
         integerList.add(1);
         integerList.add(2);
         integerList.add(3);
         integerList.add(4);
         //This following method in BigO is 0(1)
        // The operation is called constant
         System.out.println(printItem(integerList));

    }

}
