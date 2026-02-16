public class ReverseStringRec {
    public static void printRev(String str,int i){
        if(i == 0){
            System.out.print(str.charAt(i));
            return;
        }

        System.out.print(str.charAt(i));
        printRev(str, i-1);
    }

    public static void main(String[] args) {
        
        printRev("Surya", 4);
    }
}
