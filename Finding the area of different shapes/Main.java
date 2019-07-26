import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch(x){
            case 1:
                int s = sc.nextInt();
                System.out.print(s*s);
                break;
            case 2:
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.print(l*b);
                break;
            case 3:
                int ba = sc.nextInt();
                int h = sc.nextInt();
                System.out.print(0.5*ba*h);
                break;
            case 4:
                int r = sc.nextInt();

                System.out.print(3.14*r*r);
                break;
        }

    }
}