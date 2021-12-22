import com.sun.deploy.util.StringUtils;

public class AverageOfArray
{
    public static void main(String[] args)
    {
        int[] userInput = { 1,4,5,6,7,20};
        StringUtils.splitString("sou","soundarya");
        double output = AverageOfArray.getAverage(userInput);
        System.out.println("Average of an array is:"+output);
    }

    private static double getAverage(int[] userInput)
    {
        int[] input= userInput;
        int sum=0;
        double lenght=0;
        double average=0;
        for (int i = 0; i <input.length ; i++)
        {
            sum=sum+input[i];
        }
        System.out.println("Sum:"+sum);
        lenght=input.length;
        System.out.println("Lenght:"+lenght);
        average=sum/lenght;
        return average;
    }
}
