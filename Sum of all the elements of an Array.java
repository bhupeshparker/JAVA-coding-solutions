import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
      Scanner sc= new Scanner(System.in);
      int[] arr = new int[10];
      int sum=0;
      for(int i=0; i<10; i++){
          arr[i] = sc.nextInt();
      }
      for(int i=0; i<10; i++){
          sum+= arr[i];
      }
      System.out.println(sum);
      sc.close();
  }
}