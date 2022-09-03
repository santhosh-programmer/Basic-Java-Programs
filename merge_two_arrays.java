import java.util.*;
public class merge_two_arrays {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter array 1 size: ");
        int n1=ob.nextInt(),a1[]=new int[n1];
        System.out.println("Enter elements: ");
        for(int i=0;i<n1;i++)
            a1[i]=ob.nextInt();
        System.out.println("Enter array 2 size: ");
        int n2=ob.nextInt(),a2[]=new int[n2];
        System.out.println("Enter elements: ");
        for(int i=0;i<n2;i++)
            a2[i]=ob.nextInt();
        int n3=n1+n2,a3[]=new int[n3];
        System.arraycopy(a1,0, a3, 0, n1);
        System.arraycopy(a2,0, a3, n1, n2);
        System.out.println(Arrays.toString(a3));
    }
}
