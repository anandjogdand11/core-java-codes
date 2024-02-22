import java.util.*;
public class learnstack {

    public static void main(String[] args){
    Stack<String> stack1=new Stack();
    stack1.push("techlanders");
    stack1.push("solutions");
    System.out.println(stack1);

    System.out.println(stack1.peek());//removing element
    stack1.pop();
    System.out.println(stack1.peek());//removing element
}}
