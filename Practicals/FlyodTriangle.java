import java.util.*;
class FlyodTriangle {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt(),k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        ob.close();
    }
}