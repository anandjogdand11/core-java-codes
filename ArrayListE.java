import java.util.*;
public class ArrayListE{

    public static void main(String[] args){

        ArrayList<String> list= new ArrayList<String>(21);

        list.add("anand");
        list.add("anandjogdand");
        list.add("andy");
        list.add("techalnders");
        list.add("harnnors");
        list.add("ajit");
        list.add("raman");
        list.add("sandeep");//append element to the list
        list.set(2 ,"techy");
        list.addAll(list);//append list at the last

        list.remove(1);
        list.remove("anand");

        System.out.println(list);


        for (int i =0 ;i<list.size();i++){
            System.out.println("the element is " + list.get(i));
        }
    }
}
