import java.util.*;

public class Arrayg{
public static void main(String [] args){

ArrayList<String> a=new ArrayList<>();

a.add("Mahesh");
a.add("pradeep");
a.add("vasanth");
a.add("ranga");

System.out.println(a);


LinkedList<String> ll=new LinkedList<>();

ll.add("Mahesh");
ll.add("pradeep");
ll.add("vasanth");
ll.add("ranga");


System.out.print("Last Element In Linked List is:");
System.out.println(ll.getLast());

System.out.print("First Element In Linked List is:");
System.out.print(ll.getFirst());




}


}