package leetcode_02;

import java.util.List;

public class Lc_text_01 {
	 static class Solution {
		public Solution() {

		}
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode l3 = new ListNode(l1.val+l2.val);
	        ListNode temp = l3;
	        int i;
	        l1 = l1.next;
			l2 = l2.next;
	        int l1_len=0;
	        int l2_len=0;
	        l1_len = length(l1);
	        l2_len = length(l2);
	        if (l1_len>l2_len) {
				for (i = 0; i < l1_len; i++) {
					temp.next=new ListNode(l1.val+l2.val);
					l1 = l1.next;
					l2 = l2.next;
					temp = temp.next;
				}
				for (int j = 0; j < l1_len-i; j++) {
					temp.next=new ListNode(l1.val);
					l1 = l1.next;
					temp = temp.next;
				}
				for (int n = 0; n < l1_len; n++) {
					if (l3.val==10) {
						l3.val=0;
						l3.next.val += 1;
						l3 = l3.next;
					}
				}
			}else {
				for (i = 0; i < l2_len; i++) {
					temp.next=new ListNode(l1.val+l2.val);
					l1 = l1.next;
					l2 = l2.next;
					temp = temp.next;
				}
				for (int j = 0; j < l2_len-i; j++) {
					temp.next=new ListNode(l2.val);
					l2 = l2.next;
					temp = temp.next;
				}
				for (int n = 0; n < l2_len; n++) {
					if (l3.val==10) {
						l3.val=0;
						l3.next.val += 1;
						l3 = l3.next;
					}
			}
			}
	        return l3;
	    }
	    public static int length(ListNode l1) {
	    	int m = 0;
//	    	System.out.println(l1.next);
	    	while(true) {
	    		if (l1.next!=null) {
					m++;
					l1 = l1.next;
					System.out.println(l1.val);
					System.out.println("ok");
				}else {
//					System.out.println("no");
					break;
				}
	    	}
//	    	System.out.println(m);
	    	return m;
	    }
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
