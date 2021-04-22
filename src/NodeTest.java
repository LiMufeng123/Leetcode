import java.util.LinkedList;

public class NodeTest {
    public static void main(String[] args) {
        Node head = new Node(2);
        Node head1 = new Node(3);
        Node head2 = new Node(4);
        head.next = head1;
        head1.next = head2;
        Node newHead = new Node();
        Node newHead1 = new Node(6);
        System.out.println("原来的newHead1地址："+newHead1);
        newHead.next = newHead1;
        newHead1 = head;
        //head = newHead1;
        System.out.println("head地址："+head);
        System.out.println("新的newHead1地址："+newHead1);
        System.out.println("newHead的下一位置："+newHead.next);

        //return newHead;
        while(newHead1!=null){
            //System.out.println(newHead.val);
            int i =newHead1.val;
            System.out.println(i);
            newHead1 = newHead1.next;
        }
    }

}
