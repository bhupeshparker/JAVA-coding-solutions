import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            String n = sc.next();
            String n2 = new StringBuilder(n).reverse().toString();
            if(n.equals(n2)){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
    }
}