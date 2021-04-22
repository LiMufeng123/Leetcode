import java.util.LinkedList;

public class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    Node(int val, Node next){
        this.next = next;
        this.val = val;
    }
}

