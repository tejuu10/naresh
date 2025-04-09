import java.util.*;
class index{
  public static void main(String a[]){
   int n,i,count=0;
   System.out.println("Enter number");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(i=1;i<=n;i++){
      if(n%i==0)
      count++;
  }
  if(count==2)
  System.out.println(n+" is prime");
  else
   System.out.println(n+" is not  prime");
  }
}
