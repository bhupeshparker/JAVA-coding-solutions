import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int mark1 = sc.nextInt();
      int mark2 = sc.nextInt();
      int mark3 = sc.nextInt();
      int mark4 = sc.nextInt();
      int mark5 = sc.nextInt();
      int total = mark1 + mark2 + mark3 + mark4 + mark5; 
      int average = total/5;
      System.out.println(total + " " + average);
      sc.close();  
  }
}
