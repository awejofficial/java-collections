package list;
import java.util.ArrayList; // Importing the built-in class

public class ArrayListExample { // Changed name from 'ArrayList'
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 100); 
        list.add(0,11);
        list.remove(0);

        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}