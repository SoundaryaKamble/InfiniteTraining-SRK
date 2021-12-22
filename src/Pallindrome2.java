import java.util.Scanner;

public class Pallindrome2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");

        int num= s.nextInt();
        int temp=num;
        int r,sum=0;
        while (num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;

        }
        if (temp==sum)
        {
            System.out.println("Pallindrome Number");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }

    }
}
