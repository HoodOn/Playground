import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a=0;
 while(x>0){
 int n= x%10;
 a=a*10+n;
 x=x/10;}
    System.out.print(a);
}
}