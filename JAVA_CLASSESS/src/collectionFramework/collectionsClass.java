package collectionFramework;

import java.util.*;

public class collectionsClass {
    public static void main(String args[]){
        // Using a collection (ArrayList) from the Collection Framework
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(25);
       // list.sort(Integer::compareTo);
        // Sorting the list in descending order using a lambda expression
        list.sort((a, b) -> b.compareTo(a));

        // Alternatively, you can use Comparator.reverseOrder() for descending order
      //  list.sort(Comparator.reverseOrder());

        // Printing the sorted list
        System.out.println("Sorted List (Descending): " + list);
        System.out.println("List: " + list);
        

        // An array is also a collection but not part of the Collection Framework
        String[] array = {"A", "B", "C"};
        System.out.println("Array: " + Arrays.toString(array));


        // Using a method from the Collection Framework (Collections class)
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
        ArrayList<Object> a = new ArrayList<>();
        a.add("String");
        a.add(5);
        a.add(4.5);
        a.add('g');
        a.add(true);
        System.out.println(a);
        System.out.println(a.size());
        a.add(2);
        System.out.println(a);
        System.out.println(a.size());
        a.clear();
        System.out.println(a);
        System.out.println(a.size());

    }
}
