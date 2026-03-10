import java.util.*;
public class listApp
{
    public static void main(String args[])
    {
       List<Integer> li=Arrays.asList(20,30,40,50);
    try{
       int max=0;

       for(int n:li)
       {
         if(n>max)
         {
            max=n;
         }
       } 
        System.out.println(max);
      }
      catch(Exception ex)
      {
           System.out.println("Nice ");
      }
   }
}