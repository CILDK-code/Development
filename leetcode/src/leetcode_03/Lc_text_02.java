package leetcode_03;

public class Lc_text_02 {
public static void main(String[] args) {
	abc a =new abc();
	System.out.println(a.lengthOfLongestSubstring("adcadcbb"));
}
}
class abc {
    public int lengthOfLongestSubstring(String s) {
    	int num=0;
    	byte[] str =s.getBytes();
    	byte flag1;
    	byte flag2;
    	for (int i = 0; i < str.length; i++) {
    		flag1=str[i];
    	   	//System.out.println(flag1);
			for (int i2 = i+1; i2 < str.length; i2++) {
				if (flag1==str[i2]) {
					num=i2-1;
					break;
					/*if () {
						
					}*/
				}
				
			}
		}
        return num;
    }
}
