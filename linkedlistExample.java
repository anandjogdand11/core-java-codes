public class linkedlistExample {

    //variable size
    //non contiguous memory
    //insert in 0(1)
    //Search in 0(n)

    //basic structure
    //node>> it store info  --|data|next(how one node link with another link)|
    //head--first node
    //tail -- last node
    //types of linkedlist ---|1) singular > > > 2)double<><><> 3) cicular<<<>>|
    //for searching-we prefer arraylist
    //for isenrting we prefer linkelist


        public static void main(String[] args) {
            // Create a LinkedList
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Add elements to the LinkedList
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);

            // Display the LinkedList
            System.out.println("LinkedList: " + linkedList);

            // Add an element at the beginning of the LinkedList
            linkedList.addFirst(0);
            System.out.println("After adding 0 at the beginning: " + linkedList);

            // Add an element at the end of the LinkedList
            linkedList.addLast(6);
            System.out.println("After adding 6 at the end: " + linkedList);

            // Remove the first element from the LinkedList
            linkedList.removeFirst();
            System.out.println("After removing the first element: " + linkedList);

            // Remove the last element from the LinkedList
            linkedList.removeLast();
            System.out.println("After removing the last element: " + linkedList);
        }
    }


