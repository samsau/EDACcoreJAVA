package circular_linked_list_001_salunkhe;

import java.util.Scanner;

class CircularLLDriver
{
    public static void main(String args[])
    {
        CircularLinkList cl=new CircularLinkList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice : ");
        String choice[]={ "1.Insert BEG","2.Insert END","3.Insert MIDDLE","4.Delete Middle","5.Delete BEG","6.Delete END","7.Display","8.END"};
        int c;
        do
        {
             for (String s:choice)
             System.out.println(s);
             c =sc.nextInt();
             int x,y;
             switch(c)
             {
                 case 1:
                     System.out.println("Add element to begining");
                     x=sc.nextInt();
                     cl.inBeg(x);
                     break;
                 case 2:
                     System.out.println("Add element to end");
                     x=sc.nextInt();
                     cl.inEnd(x);
                     break;
                 case 3:
                      System.out.println("Enter position");
                      y=sc.nextInt();
                      System.out.println("Add element to Middle");
                      x=sc.nextInt();
                      cl.inMiddle(x,y);
                      break;
                 case 4:
                      System.out.println("Enter position");
                      y=sc.nextInt();
                      cl.delMiddle(y);
                      break;
                  case  5:
                      cl.delBeg();
                      break;
                  case 6:
                      cl.delEnd();
                      break;
                  case 7:
                      cl.display();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=8);
    }
}
