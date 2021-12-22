import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i <a.length ; i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println("After Swapping:");
        for (int i = 0; i <a.length ; i++)
        {
            System.out.println(a[i]);

        }

    }
}
