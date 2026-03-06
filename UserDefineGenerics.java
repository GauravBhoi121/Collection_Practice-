//create the user interface 
import java.util.*;
interface Abc<T>
{
    public void add(T t);
}
class bc<T> implements Abc<Integer>
{ 
     public void add(Integer i)
     {
         System.out.println(" "+i);
     }
}
class cb<T> implements Abc<String>
{
     public void add(String s)
     {
         System.out.println(""+s);
     }
}
class UserDefineGenerics
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
           
         bc<Integer> a=new bc<>();
         a.add(10);
 
         cb<String> c=new cb<>();
         c.add("hello Brother");
     }
}
        
        