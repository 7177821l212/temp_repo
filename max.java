public class max
{   
    public static int maxdigit(int num)
    {
        int max = 0;
        int digit1 = 0;
        while(num > 0)
        {
          digit1 = num % 10;
          if(digit1 > max)
          {
            max = digit1;
          }
          num/=10; 
    }
    return max;
    }
    public static void main(String[] args) {
        int digit = 0;
        int sum = 0;
        int arr [] = { 7,10,32};
        for(int num : arr)
        {
            digit = maxdigit(num);
        }
        sum+=digit;
    }
}