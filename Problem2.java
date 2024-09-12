public class Problem2
{
    public static void main(String[] args)
    {
        double firstNum = 57.3934;
        double secondNum = 22.5211;
        int firstNumRounded = (int) (firstNum + 0.5);
        int secondNumRounded = (int) (secondNum + 0.5);
        int answer = firstNumRounded + secondNumRounded;
        System.out.print(answer);
    }
}
