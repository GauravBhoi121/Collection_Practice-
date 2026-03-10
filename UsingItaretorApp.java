import java.util.*;
class UsingItaretorApp
{
    public static void main(String args[])
    {
         List li=new ArrayList();
 
        li.add(10);
        li.add(20);
        li.add(30);
 
       Iterator i=li.iterator();
       while(i.hasNext())
       {
             Object obj=i.next();
             System.out.println(obj);
       }
     
       Object ob[]=li.toArray();
System.out.println("Object Sorting ======================================");
       for(int j=0;j<ob.length;j++){
           for(int k=0;k<ob.length;k++)
           {
              int v1=(Integer)ob[j];
              int v2=(Integer)ob[k];
              if(v1>v2)
              {
                 Object temp=ob[j];
                 ob[j]=ob[k];
                 ob[k]=temp;
               }
            }
       }
        
          for(Object o:ob)
          {
              System.out.println(o);
          }   
System.out.println("Object Sorting ======================================");
                
     }
}