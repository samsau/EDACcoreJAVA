package assignment_02;

public class PR1 {

	public static void main(String [] args) 
    {
        PR1 p = new PR1();
        p.start();
    }

    void start() 
    {
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }

    boolean fix(boolean b1) 
    {
        b1 = true;
        System.out.println(b1);
        return b1;
    }

}

