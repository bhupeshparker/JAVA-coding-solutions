
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
      Scanner sc= new Scanner(System.in);
      int basic = sc.nextInt();
      double HRA = (basic*0.10);
      double DA = (basic*0.20);
      double gross = basic+HRA+DA;
      System.out.println((int) gross);
      sc.close();
  }
}
