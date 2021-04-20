package cdac.falcons.longestSubsequence;

import java.util.Scanner;

public class LongestSubsequence {
/*
write a complete program to find the length of maximum subsequence of '1' 
in the given String as '0' and '1'
if there is no subsequence of ' 1 ' print '-1'.

input : 10110111101010111101
output : 4

input : 01101
output : 2

input : 00000
output : -1

 */
	
	public void rokde() {
		Scanner input = new Scanner(System.in);

		String S= input.next();
		int maxCount=0,c=1;
		
		for(int i=0;i<S.length()-1;i++) {
			
			if(S.charAt(i)=='1') {
				
				if(S.charAt(i)==S.charAt(i+1)) {
					c++;
				}else {
					c=1;
				}
			}
			
			if(c>maxCount) {
				maxCount=c;
			}
			
		}
		
		if(maxCount==1) {
			System.out.println("-1");
		}else {
			System.out.println(maxCount);
		}
		
		input.close();

	}
	
	public void viraj() {
		Scanner sc = new Scanner(System.in);
		String str;
		str=sc.next();
		int maxCount = -1;
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='1')
			{
				if(str.charAt(i+1)==str.charAt(i))
				{
					count++;
					if(maxCount < count) {
						maxCount = count;
					}
				}
			}
			else
			{
				count=1;
			}
		}
		System.out.println(maxCount);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubsequence l = new LongestSubsequence();
//		l.viraj();
//		l.rokde();
//		int a = 2*2+1;
//		System.out.println(a);
//		System.out.println(2*2+1);
		

	}

}
