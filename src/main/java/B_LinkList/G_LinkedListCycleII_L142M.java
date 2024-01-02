package B_LinkList;

/**
 * @Classname G_LinkedListCycleII_L142M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/2 14:35
 * @Created by maicaoboy
 */
public class G_LinkedListCycleII_L142M {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null) {
            fast = fast.next;
            if(fast == null) break;
            fast = fast.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null) {
            return null;
        }
        ListNode ptr = head;
        while(ptr != slow) {
            ptr = ptr.next;
            slow = slow.next;
        }
        return slow;
    }
}
