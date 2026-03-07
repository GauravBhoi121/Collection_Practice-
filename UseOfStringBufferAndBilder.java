// StringBuffer And StringBilder Class 
import java.util.*;
class UseOfStringBufferAndBilder
{
    public static void main(String args[])
    {
         StringBuffer s=new StringBuffer("Hello Good");
         s.append(2025);
         System.out.println(" after Apdeting String "+s);
         s.insert(5," India ");
         System.out.println(" after Apdeting String "+s);
         s.delete(0,4);
         System.out.println(" after Apdeting String "+s);
         System.out.println(" after Apdeting String "+s);

    }
}