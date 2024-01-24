package B_LinkList;



/**
 * @Classname B_DesignLinkList_L707M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/29 9:49
 * @Created by maicaoboy
 */
public class B_DesignLinkList_L707M {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));

    }

}

class MyLinkedList {
    ListNode head = null;
    ListNode tail = null;

    public MyLinkedList() {
        head = new ListNode(-1, null);
        tail = head;
    }

    public int get(int index) {
        ListNode cur = head;
        int cnt = 0;
        while(cnt <= index && cur != null) {
            cur = cur.next;
            cnt++;
        }
        if(cur == null) return -1;
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val, null);
        node.next = head.next;
        head.next = node;
        if(head.next.next == null) {
            tail = head.next;
        }
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val, null);
        tail.next = node;
        tail = node;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0) {
            addAtHead(val);
            return;
        }
        ListNode pre = null, cur = head;
        int cnt = 0;
        while(cnt <= index && cur != null) {
            cnt++;
            pre = cur;
            cur = cur.next;
        }
        if(cnt > index) {
            ListNode node = new ListNode(val, cur);
            pre.next = node;
            if(cur == null) {
                tail = node;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if(index < 0) return;
        ListNode pre = null, cur = head;
        int cnt = 0;
        while(cnt <= index && cur != null) {
            cnt++;
            pre = cur;
            cur = cur.next;
        }
        if(cnt > index && cur != null) {
            pre.next = cur.next;
            if(pre.next == null) {
                tail = pre;
            }
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
