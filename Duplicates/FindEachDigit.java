import java.io.*;
import java.util.*;
import java.lang.Math;
/**
 * Write a description of class FindEachDigit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindEachDigit
{
    public static int[] findDigits(int find, int len)
    {
        int[] digits = new int[len];
        for (int i = 0; i < len; i++)
        {
            digits[i] = find % (int)(Math.pow(10,i+1)) / (int)(Math.pow(10,i));
        }
        return digits;
    }
    public static int[] reverse(int[] array)
    {
        for( int i = 0;i < array.length /2; i++)
        {
            int j = array.length -i -1;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    public static void main(String[] args)
    {
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sys.nextInt();
        String num = Integer.toString(number);
        int length = num.length();
        
        System.out.println(Arrays.toString(reverse(findDigits(number,length))));
    }
}
