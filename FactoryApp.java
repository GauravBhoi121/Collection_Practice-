\*Q1. WAP to create Store Database using LinkedList 
You have create store as linked list and add product details in LinkedList company wise 
Means we have to create 3 Pojo classes 
Product : it contain field id,name , price  
Company : it contain field name,tanNum,Product 
Means contain class contain method name as 
void addProducts(Product …p) : this method accept  infinite products 
Product getProducts(): this method can product array
Note: consider remaining setter and getter 
Store : store is POJO class it contain following fields 
void setCompany(Company …comp)
Company [] getCompanies()
void setStoreName(String name)
String getStoreName()
You have to perform following task 
Case 1: add new company  product in store 

Case 2: view all store details like as store name, company name and company products 
Like as*\
import java.util.*;
public class Product
{
     private int Id;
     private String Name;
     private int Price;
     
     void setId(int Id)
     {
         this.Id=Id;
     }
     int getId()
     {
          return Id;
     }
     void setName(String Name)
     {
         this.Name=Name;
     }
     String getName()
     {
          return Name;
     } 
     void setPrice(int Price)
     {
         this.Price=Price;
     }
     int getPrice()
     {
          return Price;
     }
     public String ToString()
     {
           return "ID: "+Id+",Name: "+Name+",Price: "+Price;
     }
}
public class Company
{
    private String Name;
    private String tanNum;
    private LinkedList Products =new LikedList(); 
    public Company(String Name,String tanNum)
    {
       this.Name=Name;
       this.tanNum=tanNum;
    }
    public String getname()
    {
        return Name;
    }
    public String gettannum ()
    {
       return tanNum;
    }
    void add product(product ...p)
    {
         for(int i=0;i<p.length;i++)
         {
              products.add(p[i]);
         }
        
    }
    public Product[] getproduct()
    {
        return products;
    }
    
}
public class Store
{
     private String StoreName;
     private Company companys[];
     
     public void setStoreName()
     {
        this.StoreName=StoreName;
     }
     public String getStoreName()
     {
         return StoreName;
     }
     public void setCompany(company ...c)
     {
         this.companies=c;
     }
     public company[] getcompanies()
     {
          return companies;
     }
 
}
public class FactoryApp
{
    public static void main(String args[]);
    {
        Scanner sc=new Scanner(System.in);
        
        Store store=new Store();
        store.setTanNum("XYZ Comapany");
        store.setTaNum("Tan001");
        
        Product p1=new Product();
        p1.setId(1);
        p1.setName("a11"); 
        p1.setPrice(100);
        
        Product p2=new Product();
        p2.setId(2);
        p2.setName("b11");
        p2.setPrice(200);
        
        c1.addProduct(p1,p2);
        
        Company c2=new Company();
        
        product p3=new Product();
        p3.setId(1);
        p3.setName("cc");
        p3.setPrice(230);
       
        product p4=new Product();
        p4.setId(2);
        p4.setName("d1");
        p4.setPrice(300)
              
    }
}