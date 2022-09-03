import java.util.* ;
public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double n1 = sc.nextInt(); 
        double n2 = sc.nextInt(); 
        double n3 = sc.nextInt();
        if(n1 >= n2) { 
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number."); 
        else
            System.out.println(n3 + " is the largest number.");
        } 
        else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number."); 
            else
        System.out.println(n3 + " is the largest number.");
        }
    }
}
