package list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistExample {
    public static void main(String[] args) {
        // CopyOnArrayList: Safe for concurrent modification during iteration
        
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("chicken");
        System.out.println("Initial Shopping List: " + shoppingList);        

        for(String item : shoppingList) {
            if(item.equals("Eggs")){
                shoppingList.add("Chicken Eggs");
                System.err.println("Updated Shoping List:"+ shoppingList);
            }
        }
    }

}
