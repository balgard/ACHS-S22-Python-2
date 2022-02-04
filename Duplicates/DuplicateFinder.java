import java.util.Arrays;
public class DuplicateFinder 
{
  public static boolean inArray(int value, int[] test)
  {
    for (int element : test)
    {
      if (value == element)
      {
        return true;
      }
    }
    return false;
  }
  public static int[] findDuplicates(int[] a, int[] b)
  {
    int length = (int) (a.length+b.length)/2;
    int[] dupes = new int[length];
    int currentPos = 0;
    for(int i = 0; i < a.length; i++)
    {
      for (int j : b)
      {
        if ((a[i] == j) && !(inArray(j,dupes)))
        {
          dupes[currentPos] = j;
          currentPos ++;
        }
      }
    }
    return dupes;
  }
  public static void main(String[] args) 
  {
      int[] nums = {1,2,3,4,5,6,7,9};
      int[] others = {1,2,3,4,13,9,16,7};
      int[] dupes =  findDuplicates(nums,others);
      System.out.println(Arrays.toString(dupes));
  }
}