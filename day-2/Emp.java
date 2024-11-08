importjava.util.Scanner;
class Emp
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int eno;
  String ename;
  Float esal;
  System.out.println("Enter Employee number:");
  eno=sc.nextInt();
  System.out.println("Enter Employee name:");
  ename=sc.next();  
  System.out.println("Enter Employee salary:");
  esal=sc.nextFloat();
  System.out.println("The given employee number is:"+eno);
  System.out.println("The given employee name is:"+ename);
  System.out.println("The given employee salary is:"+esal);
 }
}  