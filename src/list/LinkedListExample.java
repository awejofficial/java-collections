package list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Linkedlist Integer Type
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

          list.addFirst(0);
          list.addLast(7);
          list.get(3);
         // list.removeIf(n-> n%2==0); // removes the even elements in that (Anonymous Function)
         // list.removeIf(n-> n%2!=0); // removes the odd elements in that
         System.out.print(list);
         
        // Creted LinkeList Of String and Remove Some Elements
        System.out.println("---- Before Removing ----"); //animals which has some other names
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("dog","cat","ujef","awej"));
        for(String a: animals){
            System.out.println(a);
        }

        System.out.println("---- After Removing ----");// after removing some animals 
        LinkedList<String> animalsToremove = new LinkedList<>(Arrays.asList("ujef","awej"));

        animals.removeAll(animalsToremove);

        for(String a: animals){
            System.out.println(a);
    }
}
}
