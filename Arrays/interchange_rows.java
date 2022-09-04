import java.util.*;
public class interchange_rows {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of rows and columns: ");
        int r=ob.nextInt(),c=ob.nextInt(),a[][]=new int[r+1][c+1],temp;
        System.out.println("Enter elements: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
            temp=a[i][0];
            a[i][0]=a[i][c-1];
            a[i][c-1]=temp;
        }
        System.out.println("After interchanging: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        ob.close();
    }   
}