import java.util.Scanner; 
class binary_search {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,6,9,12,15,18};
        int first, mid, last; 
        System.out.println("Given array element:"); 
        for (int i=0; i<arr.length ;i++ ) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n===================="); 
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter the element to search:");
        int search = scn.nextInt(); first = 0;
        last = arr.length-1; mid = (first+last)/2;
        while (first <= last){
            if  (arr[mid] < search) { 
                first = mid + 1;
            }
            else if (arr[mid] == search) { 
                System.out.println(search+" is found at location: "+ (mid+1)); break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last) /2;
        }
        if (first > last) {
            System.out.println("Element is not found");
        }
    }
}

