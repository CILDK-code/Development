package leetcode_01;

import java.util.Scanner;

public class Lc_text_01 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] new_nums =new int[2];
     for (int i = 0; i < nums.length; i++) {
		int n=nums[i];
		for (int i2 = i+1; i2 < nums.length; i2++) {
			int m = nums[i2];
			if ((n+m)==target) {
		       new_nums[0]=i;
		       new_nums[1]=i2;
			}
		}
	}
    	return new_nums;
    }
}