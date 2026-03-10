import java.util.*;
public class VectorApp
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         
         Vector v=new Vector();  List li=new ArrayList();  ArrayList al=new ArrayList();  LinkedList ll=new LinkedList();
         Set set=new HashSet();  HashSet hs=new HashSet(); LinkedHashSet  lhs=new LinkedHashSet(); TreeSet ts=new TreeSet();
         Stack s=new Stack();
      
         hs.addAll(Arrays.asList(1,1,2,2,2,3,3,4,4,5,6,7,7,0));
         lhs.addAll(Arrays.asList(1,1,2,2,2,3,3,4,4,5,6,7,7,0));
  
         ts.addAll(Arrays.asList(1,1,2,2,2,3,3,4,4,5,6,7,7,0));
         set.addAll(Arrays.asList(1,1,2,2,2,3,3,4,4,5,6,7,7 ,0));         
         
        
        
        System.out.println(set);
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
     
      

     }
 }