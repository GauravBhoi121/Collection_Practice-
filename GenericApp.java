//creating the generic interface 
import java.util.*;
class Abc<T>
{ 
      Object obj[]=new Object[10];
int count;
      void add(T t)
      { 
          obj[count]=t;
          ++count;
      }
      void show()
      {
         for(int i=0;i<count;i++)
         {
           System.out.println("  "+obj[i]);
         }
      }
}
class GenericApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Abc<Integer> a=new Abc<>();
        a.add(10);
        a.add(20);
       
        a.show();
    }
}