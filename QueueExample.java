import java.util.*;

public class QueueExample {
    public static void main(String[] args){
        Queue<String> Q = new LinkedList<>(); // Initialize Queue with LinkedList
        Q.offer("anand");
        Q.offer("a");
        Q.offer("nd");
        Q.offer("ad");
        Q.offer("and");
        System.out.println(Q);
        System.out.println(Q.poll());//RETURNS AND REMOVES THE HEAD OF THE QUEUE.RETURN NULL IF THE NULL IS EMPTY
        System.out.println(Q);
        System.out.println(Q.peek());//RETURN THE HEAD OF THE QUEUE
        System.out.println(Q);
        // Now you can use methods of Queue interface such as add(), offer(), poll(), etc.
    }
}
