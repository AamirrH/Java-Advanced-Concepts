package Collection_Frameworks;

import java.util.ArrayList;
import java.util.List;

public class Collection_Methods {


    void main(){

      // Collection Interface Methods :-
      List<Integer> list = new ArrayList<>();
      /* using list as a reference variable which of Type List(Interface) we can only access
      Default methods of List and Collection Interface and also methods to be implemented in Arraylist class.
       */

      // Add Method - adds an element to the dynamic Arraylist
        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println(list);
      // list.size(), returns the numbers of element in the Arraylist
        System.out.println("The Size of the list is : "+list.size());

      // remove -> removes an element by specifying its index
        list.remove(2);
        System.out.println(list); //300 is at index 2 hence it will be removed.
      // remove -> another remove method that removes an element by converting to an Object,
        list.remove(Integer.valueOf(200));
        System.out.println(list); // Element 200 will be removed, .valueOf creates an Integer Object with its data field set as 200.

        System.out.println(list.contains(100));
      // containsAll -> returns true if collection contains all of the elements of the specified collection
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
       // Should return true since list contains only 100 and list 2 contains 100 and all other elements
      System.out.println(list2.containsAll(list));
      // addAll adds a list to another list, contains duplicate elements too.
      List<Integer> list3 = new ArrayList<>();
      list3.add(700);
      list3.add(800);
      list3.add(900);
      list3.add(100);
      list3.addAll(list2);
      System.out.println(list3);
      // removeAll -> removes all the elements of the argument list, from the actual list, removes duplicates too.
      list3.removeAll(list2);
      System.out.println(list3);
      //retainAll -> removes all the elements from list3, not present in list2.
      list3.retainAll(list2);
      System.out.println(list3);
      list3.add(700);
      list3.add(800);
      list3.add(900);
      list3.add(100);
      //clear() -> removes all the elements from the list.
      Object[] a = list3.toArray();
      // Downcasting to Integer Object
      // Object toArray method :-
      for(Object o : a){
        Integer i = (Integer)o;
        System.out.print(i+" ");
      }

    }



}
