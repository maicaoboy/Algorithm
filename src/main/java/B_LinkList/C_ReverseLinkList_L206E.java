package B_LinkList;

/**
 * @Classname C_ReverseLinkList_L206E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/2 14:30
 * @Created by maicaoboy
 */
public class C_ReverseLinkList_L206E {
    public ListNode reverseList(ListNode head) {
        ListNode vhead = new ListNode(-1, null);
        ListNode cur = head, pre = head;
        while(cur != null) {
            pre = cur;
            cur = cur.next;
            insert(vhead, pre);
        }
        return vhead.next;
    }

    void insert(ListNode vhead, ListNode node) {
        node.next = vhead.next;
        vhead.next = node;
    }
}
