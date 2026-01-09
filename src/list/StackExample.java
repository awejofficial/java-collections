package list;

import java.util.LinkedList;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("---------- Basic Stack Operations: ----------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("The Stack:"+ stack);
        stack.pop();
        System.out.println("After pop operation, The Stack:"+ stack);
        stack.push(5);
        System.out.println("After push operation, The Stack:"+ stack);
        System.out.println("The top element is: " + stack.peek());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("Does the stack contain 2? " + stack.contains(2));
        System.out.println("After Deleting the Top Element of the Stack:"+ stack.pop());
        System.out.println("The Stack after deleting the top element:"+ stack);
        System.out.println("Searching for element 2 in the stack, found at position: " + stack.search(2));

        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("\n---------- Using LinkedList as a Stack: ----------");
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        System.out.println("The LinkedList Stack: " + linkedList);
        linkedList.pop();
        System.out.println("After pop operation, The LinkedList Stack: " + linkedList);
        System.out.println("\n---------- Linkedlist Native Funtions: ----------");
        linkedList.addFirst(5);
        System.out.println("After addFirst(5), The LinkedList Stack: " + linkedList);
        linkedList.addLast(40);
        System.out.println("After addLast(40), The LinkedList Stack: " + linkedList);
        System.out.println("The Last Element in the linkedList is:"+ linkedList.getLast());
        System.out.println("The First Element in the linkedList is:"+ linkedList.getFirst());
        System.out.println("Is the LinkedList Stack empty? " + linkedList.isEmpty());
        System.out.println("The Size of the LinkedList is: "+ linkedList.size());
        linkedList.clear();
        System.out.println("Clearing the LinkedList:"+ linkedList);

        System.out.println("\n\n---------- ArrayList as a stack: ----------");
        System.out.println("Peek:"+ stack.peek());

    }

}
