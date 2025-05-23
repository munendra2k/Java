public class SumNumberDigits{
    private static int sumDigits(int num) {
        int sum=0;

        while (num>0) {
            sum+= num%10;
            num/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int num=11;
        System.out.println(sumDigits(num));
    }
}
