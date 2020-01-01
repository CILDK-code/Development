package leetcode_02;

import leetcode_02.Lc_text_01.Solution;

public class Test {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode addTwoNumbers = Solution.addTwoNumbers(l1, l2);
//		for (int i = 0; i < Solution.length(addTwoNumbers); i++) {
//			System.out.println(addTwoNumbers.val);
//			addTwoNumbers = addTwoNumbers.next;
//		}
//		System.out.println(addTwoNumbers.next.val)
	}
}
