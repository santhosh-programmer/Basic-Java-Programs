import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=ob.nextInt();
        int a[]=new int[n];
        int temp;
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(a[j]>a[j+1]) {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }                                                                                                                                              
            }
        }
        System.out.println("Second largest is "+a[a.length-2]);
        ob.close();
    }    
}