public class DisplayOddNumbers
{
  public static void main(String[]args)
  {
    int num=100;
    System.out.println("list of odd numbers from 1 to"+num+".");
    for(int i=1;i<=num;i++)
    {
      if(i%2!=0)
      {
        System.out.println(i+"");
      }
    }
  }
}
