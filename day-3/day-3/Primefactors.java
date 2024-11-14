import java.util.Scanner;
class Primefactors
{
 public static void PrimeFactors(int n) 
 {
   while (n % 2 == 0) 
   {
    System.out.println(2+" ");
     n/=2; 
   }
   for (int i = 3;i <= Math.sqrt(n);i += 2) 
   {     
     while (n%i==0) 
     {
       System.out.println(i + " ");
        n /= i; 
      }
   }
   if(n>2)
   {
    System.out.println(n + " ");
    }
  }
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();      
    System.out.println("The Prime factors of " + n + " are: ");
    Primefactors(n);
  }
}