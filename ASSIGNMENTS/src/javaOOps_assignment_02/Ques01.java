package javaOOps_assignment_02;
import java.util.*;
public class Ques01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("ENTER THE NUMBER");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		sc.close();
	}
}
