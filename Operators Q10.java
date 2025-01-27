import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
      Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      int thousand = (a/1000);
      int hundred = (a/100)%10;
      int ten = (a/10)%10;
      int one = (a%10);
      thousand = (thousand+1)%10;
      hundred = (hundred+1)%10;
      ten = (ten+1)%10;
      one = (one+1)%10;
      int x = thousand*1000 + hundred*100 + ten*10 + one;
      System.out.println(x);
      sc.close();
  }
}
