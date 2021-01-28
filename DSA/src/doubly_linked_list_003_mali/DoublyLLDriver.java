package doubly_linked_list_003_mali;

import java.util.Scanner;

class DoublyLLDriver
{
    public static void main(String args[])
    {
        DoublyLL dl=new DoublyLL();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Choice : ");
         String choice[]={ "1.Insert BEG","2.Insert END","3.Insert MIDDLE","4.Delete Middle","5.Delete BEG","6.Delete END","7.Display  Forward","8.Display Backward","9.END"};
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
                      dl.insertFirst(x);
                      break;
                  case 2:
                      System.out.println("Add element to end");
                      x=sc.nextInt();
                    dl.insertLast(x);
                      break;
                  case 3:
                       System.out.println("Enter position");
                       y=sc.nextInt();
                        System.out.println("Add element to Middle");
                        x=sc.nextInt();
                      dl.insertMiddle(x, y);
                      break;
                  case 4:
                      System.out.println("Enter position");
                       y=sc.nextInt();
                   dl.deleteMiddle(y);
                      break;
                  case  5:
                    dl.deleteFirst();
                      break;
                  case 6:
                     dl.deleteLast();
                      break;
                  case 7:
                     dl.displayForward();
                      System.out.println("");
                      break;
                  case 8:
                     dl.displayBackward();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=9);
    }
}