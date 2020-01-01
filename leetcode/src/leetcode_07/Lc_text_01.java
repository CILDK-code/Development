package leetcode_07;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Lc_text_01 {
public static void main(String[] args) {
	Solution solution =new Solution();
	Scanner scanner =new Scanner(System.in);
	String nextLine = scanner.nextLine();
	solution.reverse(Integer.parseInt(nextLine));
}
}
class Solution {
	public int reverse(int x) {
        int flag = 0;
        if (x<0) {
        	int temp1 = (-1)*x;
        	System.out.println(temp1);
			int temp = x + temp1 * 2;
			int n = 0;
			int m = 0;
			String str = new String();
			while(temp!=0) {			 
				n = temp % 10;
				m = m*10 + n;
				str = str + n + "";
				temp = temp / 10;	
			 }
			return (-1)*(new BigInteger(str).intValue());
		}else if(x>0) { 
			int temp = x;
			int n = 0;
			int m = 0;
			String str = new String();
			while(temp!=0) {			 
				n = temp % 10;
				m = m*10 + n;
				str = str + n + "";
				temp = temp / 10;	
			 }
			return new BigInteger(str).intValue();
		}else {
			return 0;
		}
    }
}

//long rs = 0;
//while(x != 0){
//    rs = rs*10+x%10;
//    x /= 10;
//}
//return (rs<Integer.MIN_VALUE || rs>Integer.MAX_VALUE) ? 0:(int)rs;
//}
