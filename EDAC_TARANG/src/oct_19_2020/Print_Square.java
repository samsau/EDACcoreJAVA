package oct_19_2020;
import java.util.*;
public class Print_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=0;i<col;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<row-2;i++)
        {
            System.out.print("*");
            for(int j=0;j<col-2;j++)
                System.out.print(" ");
            System.out.println("*");
        }
        //System.out.println();
        for(int i=0;i<col;i++)
        {
            System.out.print("*");
        }
        sc.close();
	}
}
