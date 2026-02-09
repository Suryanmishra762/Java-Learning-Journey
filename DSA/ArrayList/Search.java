import java.util.ArrayList;

public class Search{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(3);
        list.add(12);
        list.add(13);

        System.out.println(list);

        int x = 12;

        for(int i = 0; i < list.size(); i++){
            int a = list.get(i);
            if(a == x){
                System.out.println("X Found at " + i);
                break;
            }
        }
    }
}
