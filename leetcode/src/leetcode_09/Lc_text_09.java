package leetcode_09;

import java.util.Scanner;

public class Lc_text_09 {
public static void main(String[] args) {
	Solution solution =new Solution();
	Scanner scanner=new Scanner(System.in);
	System.out.println(solution.isPalindrome(scanner.nextInt()));
}
}
class Solution {
    public boolean isPalindrome(int x) {
    	boolean flag=false;
    	String string =Integer.toString(x);
    	byte[] bs=string.getBytes();
    	byte[] c=new byte[bs.length];
    	for(int j=0;j<=bs.length-1;j++)
		{
			c[j]=bs[bs.length-1-j];
		}
    	/*for (int i = 0; i < c.length; i++) {
			
    		System.out.println(c[i]);
    		System.out.println(bs[i]);
		}*/
    	
    	if (c.equals(bs)) {
			flag=true;
		}
        return flag;
    }
}