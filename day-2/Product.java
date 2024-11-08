import java.util.Scanner;
class Product
{
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
 int Pno;
 String Pname;
 float Pqty;
 float Pcost;
 float bill;
 System.out.println("enter Product number");
 Pno=Sc.nextInt();
 System.out.println("enter Product name");
 Pname=Sc.next();
 System.out.println("enter Product quantity");
 Pqty=Sc.nextFloat();
 System.out.println("enter Product cost");
 Pcost=Sc.nextFloat();
 bill=Pcost*Pqty;
 System.out.println("the given Pno is:"+Pno);
 System.out.println("the given Pname is:"+Pname);
 System.out.println("the given Pqty is:"+Pqty);
 System.out.println("the given Pcost is:"+Pcost);
 System.out.println("the final bill is:"+bill);
}
}






 