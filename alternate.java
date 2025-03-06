import java.util.*;
public class alternate
{
    public static void main(String [] args)
    {

        int arr[] ={1 ,5 ,6 ,7 ,8 ,9 ,0};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i+=2)
        {
            list.add(arr[i]);
        }
        int j = list.size() - 1;
        for(int i = 1; i < arr.length; i+=2)
        {
            arr[i] = list.get(j);
            j--;
        }
        for(int num : arr)
        {
            System.out.print(num);
        }
    }
}