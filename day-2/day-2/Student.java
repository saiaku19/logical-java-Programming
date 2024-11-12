import java.util.Scanner;
class Student 
{
public static void main(String agrs[])
{
 Scanner sc=new Scanner(System.in);
  int sno,math,phy,chem,tot;
  String sname;
  float savg;
 System.out.println("Enter Student number:");
  sno=sc.nextInt();
 System.out.println("Enter Student name:");
  sname=sc.next();
 System.out.println("Enter math marks:");
  math=sc.nextInt();
 System.out.println("Enter phy marks:");
  phy=sc.nextInt();
 System.out.println("Enter chem marks :");
  chem=sc.nextInt();
 tot=math+phy+chem;
 savg=tot/3;
 System.out.println("Student Report:");
 System.out.println("Student number:"+sno);
 System.out.println("Student name:"+sname);
 System.out.println("Student totmarks:"+tot);
 System.out.println("Student avg marks:"+savg);
}
}