import java.util.ArrayList;
import java.util.Collections;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Get element
        int element1 = list.get(0);
        System.out.println(element1);

        //add element in between
        list.add(1,10);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //remove element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
