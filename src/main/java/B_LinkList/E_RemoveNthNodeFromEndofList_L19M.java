package B_LinkList;

/**
 * @Classname E_RemoveNthNodeFromEndofList_L19M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/2 14:32
 * @Created by maicaoboy
 */
public class E_RemoveNthNodeFromEndofList_L19M {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode vhead = new ListNode(-1, head);
        int i = 0;
        ListNode ptr = vhead;
        while(i < n && ptr != null) {
            i++;
            ptr = ptr.next;
        }
        if(ptr == null) {
            return vhead.next;
        }
        ListNode pre = vhead, cur = ptr;
        while(cur.next != null) {
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return vhead.next;
    }
}
