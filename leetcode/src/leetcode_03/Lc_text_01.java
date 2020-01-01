package leetcode_03;

import java.util.LinkedList;
import java.util.Stack;

public class Lc_text_01 {

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int num = 0;
    	int temp = 0;
    	char[] charArray = s.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			int indexOf = list.indexOf(charArray[i]);
			if (indexOf!=-1) {
				temp = i - indexOf + 1;
				if (num<temp) {
					num = temp;
				}
			}
			list.add(charArray[i]);
			stack.push(charArray[i]);
			
		}
        return num;
    }
}
