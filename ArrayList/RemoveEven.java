import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            int e = list.get(i);
            if(e%2 == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
