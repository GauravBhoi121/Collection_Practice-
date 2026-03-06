// besicaly there are two type of generic first is bounded genrics and second id un bounded genrics 
//Explean unbounded generics 
import java.util.*;
class Test
{
    public void show(List<?> list)
    {
        for(Object o:list)
        {
           System.out.println(" "+o);
        }
    }
}
class UnboudedGenericsApp
{  
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
       
         List<Integer> li=new ArrayList<>();
 
        li.add(10);
        li.add(30);
        li.add(50);
 
        Test t=new Test();
        t.show(li);

        List<Float> f=new ArrayList<>();
        f.add(20.0f);
        f.add(30.0f);
        f.add(20.5f);

        
        t.show(f);
     }
}







