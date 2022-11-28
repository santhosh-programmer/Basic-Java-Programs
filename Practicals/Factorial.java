import java.util.Scanner;

public class Factorial {
    static int fact(int n)
    {
        return (n==1)?1:n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println("Factorial: "+fact(n));
        ob.close();
    }
}
