package assignment_02;

public class PR2 
{
	    public static void main(String [] args) 
	    {
	        PR2 p = new PR2();
	        p.start();
	    }
	    void start() 
	    {
	        long [] a1 = {3,4,5};
	        long [] a2 = fix(a1);
	        System.out.print(a1[0] + a1[1] + a1[2] + " ");
	        System.out.println(a2[0] + a2[1] + a2[2]);
	    }
	    long [] fix(long [] a3) 
	    {
	        a3[1] = 7;
	        return a3;
	    }
}
