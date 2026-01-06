package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {
    public static void main(String [] args){
        Vector<Integer> vec = new Vector<>(5); // initial capacity 5
        System.out.println(vec.capacity());
        vec.add(1);
        vec.add(1);
        vec.add(1);
        vec.add(1);
        vec.add(0,1);
        System.out.print(vec.get(1)); // this will increase the size by 2
        System.out.println(vec.set(0, 34));
        System.out.println(vec.size());
        System.out.println("--------");
        for(int i=0; i<vec.size(); i++){
            System.out.print(vec.get(i)+" ");
        }
        Vector<Integer> vec2 = new Vector<>(Arrays.asList(1));
        System.out.println(vec.removeAll(vec2));
        System.out.println(vec);
        

        //collection to vector added the linked list elements to vector
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Vector<Integer> VecFromList = new Vector<>(list);
        System.out.println(VecFromList);

    }

}
