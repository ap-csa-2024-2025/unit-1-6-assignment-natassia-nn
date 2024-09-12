public class Problem3
{
    public static void main(String[] args)
    {
        double val = 67.3424;
        int betterVal = (int) (val * 1000); // 67342
        System.out.print(betterVal/100%10 + " ");
        System.out.print(betterVal/10%10 + " ");
        System.out.print(betterVal%10);
    }
}
