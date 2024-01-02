package B_LinkList;

/**
 * @Classname D_SwapNodesinPairs_L24M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/2 14:31
 * @Created by maicaoboy
 */
public class D_SwapNodesinPairs_L24M {
    public ListNode swapPairs(ListNode head) {
        ListNode vhead = new ListNode(-1, head);
        ListNode pre = vhead, cur = vhead;
        while(cur != null) {
            cur = cur.next;
            if(cur == null) break;
            cur = cur.next;
            if(cur == null) break;
            pre.next.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            pre = cur.next;
            cur = pre;
        }
        return vhead.next;
    }
}
