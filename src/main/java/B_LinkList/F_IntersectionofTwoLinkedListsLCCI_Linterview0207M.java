package B_LinkList;

/**
 * @Classname F_IntersectionofTwoLinkedListsLCCI_Linterview0207M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/2 14:33
 * @Created by maicaoboy
 */
public class F_IntersectionofTwoLinkedListsLCCI_Linterview0207M {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = getLength(headA);
        int lb = getLength(headB);
        ListNode ptr1 = headA, ptr2 = headB;
        if(lb > la) {
            ptr1 = headB;
            ptr2 = headA;
            int temp = la;
            la = lb;
            lb = temp;
        }
        for(int i = 0; i < la - lb; i++) {
            ptr1 = ptr1.next;
        }
        while(ptr1 != null && ptr2 != null) {
            if(ptr1 == ptr2) break;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    int getLength(ListNode head) {
        int cnt = 0;
        while(head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}
