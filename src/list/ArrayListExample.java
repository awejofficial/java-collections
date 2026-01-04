package list;
import java.util.ArrayList; 
import java.util.List; // Added this import

public class ArrayListExample { 
    public static void main(String args[]){

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("guava");
        fruits.add("carrot");
        fruits.add("Cherry");

        fruits.remove("apple");

        // Fixed 'I++' to 'i++' and used .get(i)
        for(String fruit : fruits) {
             System.out.println(fruit); 
        }
    }
}       // ArrayList<Integer> list = new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.set(1, 100); 
        // list.add(0,11);
        // list.remove(0); 

        // for(int i=0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
//     }
// }