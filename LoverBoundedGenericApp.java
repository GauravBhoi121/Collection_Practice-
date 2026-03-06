// Lover bounded generic Class we use the super Key for Lover Bounded generics 
import java.util.*;
class Test
{
     public void show(List<? super Integer> li)
     {
        for(Object ob:li)
        { 
            System.out.println(""+ob);
        }
     }
}
class LoverBoundedGenericApp
{
     public static void main(String args[])
     {
         List<Number> li=Arrays.asList(100,200,300,400);
         Test t=new Test();
         t.show(li);
     }
}