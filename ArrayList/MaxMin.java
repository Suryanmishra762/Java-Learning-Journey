import java.util.ArrayList;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(10);
        list.add(7);
        list.add(0);

        System.out.println(list);

        int max = list.get(0);

        for(int i = 1; i < list.size(); i++){
            int m = list.get(i);
            if(m > max){
                max = m;
            }
        }

        System.out.println(max);
    }
}
