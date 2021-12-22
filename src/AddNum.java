import java.util.Scanner;

public class AddNum
{
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number1");
        num1=s.nextInt();
        System.out.println("Enter Number2");
        num2=s.nextInt();

        sum=num1+num2;
        System.out.println("Sum of These Numbers:"+sum);
    }
}
