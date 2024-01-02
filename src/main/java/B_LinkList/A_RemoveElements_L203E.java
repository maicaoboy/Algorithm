package B_LinkList;

/**
 * @Classname A_RemoveElements_L203E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/29 9:41
 * @Created by maicaoboy
 */


public class A_RemoveElements_L203E {
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode();
        header.next = head;

        ListNode pre = header, cur = header.next;

        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
                cur = pre.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        return header.next;
    }
}

