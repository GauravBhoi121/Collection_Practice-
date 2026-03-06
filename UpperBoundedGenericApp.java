//bouded generice upper bounded 
import java.util.*;
class Test
{
    public void show(List<? extends Number> li)
    {
       for(Object ob:li)
       {
           System.out.println(" "+ob);
       }
    }
}
class UpperBoundedGenericApp
{
    public static void main(String args[])
    {
         List<Integer> li= Arrays.asList(10,20,30,40);
         Test t=new Test();
         t.show(li);
         List<Float> ls= Arrays.asList(2.2f,2.3f,33.3f);
         t.show(ls);
    }
}
        
      