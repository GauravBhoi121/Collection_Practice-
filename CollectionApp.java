import java.util.*;
class ObjectApp
{
    void getobject()
    {
        Object obj[]=new Object[5]; 
        obj[0]=100;
        obj[1]=new java.util.Date();
        obj[2]="good morning";
        obj[3]=false;
        obj[4]=4.4f;
        for(int i=0;i<obj.length;i++)
        {
           if(obj [i] instanceof String)
           {
              System.out.println("it is String ="+obj[i]);
           }
           else if(obj [i] instanceof Integer)
           {
              System.out.println("its integer object = "+obj[i]);
           }
           else if(obj[i] instanceof Float)
           {
              System.out.println("its float object = "+obj[i]);
           }
           else 
           {
                 System.out.println("its date = "+obj[i]);
           }
        }
            
    }
    
}
class CollectionApp
{
   public static void main (String args[])
   {
      Scanner sc=new Scanner(System.in);
      ArrayList al=new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      ObjectApp ob=new ObjectApp();
       System.out.println("1.create object and store any type of data\n2.find the size of array list.\n3.find the arrayList empty or not.\n4.Array list contains input number or not\n5.feach data from collection.\nconvert you collection to Array 7.adding new element in collection \n8.remove Element From Collection");
      System.out.println("enter the choice ");
      int choice =sc.nextInt();
      switch(choice)
      {
         
          case 1:
                   ob.getobject();
                   break;
    
          case 2: 
                  int s=al.size();
                  System.out.println("array List Size Is ="+s);
                   break;
          case 3:
                   boolean b=al.isEmpty();
                   if(b)
                   {
                       System.out.println("Array List is Empty");
                   }
                   else
                   {
                         System.out.println("Array List not Empty");
                   }
                   break;
         case 4:
                   System.out.println("Enter the number ");
                   int n=sc.nextInt();
                   b=al.contains(n);
                  if(b)
                   {
                       System.out.println("Array List contains element ");

                   }
                   else
                   {
                         System.out.println("Array List Not contains element ");
                   }
                     break;
         case 5:
                  System.out.println("ArrayList data is =");
                  Iterator i= al.iterator();
                  while(i.hasNext())
                  {
                       Object obj=i.next();
                       System.out.print("\t"+obj);
                  }
                  break;
        case 6:
                    Object Obj[]=al.toArray(); 
                    break;
                   
        case 7:
                  System.out.println("add element in collection");
                  System.out.println("enter for adding number");
                  int add=sc.nextInt();
                  b=al.add(add);
                  if(b)
                  {
                       System.out.println("Element Added ");
                  }
                  else 
                  {
                      System.out.println("element not added");
                  }
                  System.out.println("Ellement Added is ");
                  Iterator z=al.iterator();
                  while(z.hasNext())
                  {
                       Object obj=z.next();
                       System.out.println(obj);
                  }
                  break;
                  
         default:
                  System.out.println("wrong choice ");
      }
   }
}       