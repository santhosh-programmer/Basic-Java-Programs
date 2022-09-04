import java.util.Scanner;
public class sort_array {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=ob.nextInt(),arr[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            arr[i]=ob.nextInt();
        System.out.println("Enter 1-ascending 2-descending: ");
        int ch=ob.nextInt(),temp,i,j;
        for(i=0;i<n-1;i++) {
            for(j=0;j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting: ");
        if(ch==1) {
            for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        }
        else {
            for(i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
        }
    }
}
