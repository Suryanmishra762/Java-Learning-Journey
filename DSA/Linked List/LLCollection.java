import java.util.*;

public class LLCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addLast("List");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);
        System.out.println(list.size());

        for(int i  = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " --> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add(1, "Like");
        System.out.println(list);

        Collections.reverse(list); //O(n) and Space complexity O(1)
        System.out.println(list);
    }
}
