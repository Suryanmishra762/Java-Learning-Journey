public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;

        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node SecondLast = head;
        Node Last = head.next;
        while(Last.next != null){
            SecondLast = SecondLast.next;
            Last = Last.next;
        }

        SecondLast.next = null;
    }

    //reverse iterate O(n) and Space complexity O(1)
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head.next = null;
        head = prev;

    }

    //reverese recursive O(n) and Space complexity O(1)
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //print
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    //get size
    public int getSize(){
        return size;
    }

    //remove nth from last
    public void removeNthFromLast(int n, int size){
        if(size-n <= 0){
            head = null;
        }
        Node currNode = head;
        for(int i = 1; i < size-n; i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        currNode.next.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
        int size = list.getSize();
        list.removeNthFromLast(2, size);
        list.printList();
    }
}
