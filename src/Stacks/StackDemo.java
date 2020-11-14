package Stacks;
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        //giving our stack elements
        stack.push("BOTTOM");
        printStack(stack);
        stack.push("two");
        printStack(stack);
        stack.push("three");
        printStack(stack);

        //pop stack 3 times to remove all elements
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);


    }
    //method that prints stack until no elements left
    private static void printStack (Stack<String> stack){
        if(stack.isEmpty())
            System.out.println("You have nothing in your stack:(");
        else
            System.out.printf("%s TOP\n", stack);
    }
}
