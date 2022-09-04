import java.io.*;
public class max_min{
    public static void main(String args[]){ 
        int sum=0,i,count=0,max,min,n;
        float avg;
        if (args.length == 0)
            System.out.println("Argument is expected"); 
        else { 
            i = args.length;
            max = Integer.parseInt(args[0]); 
            min = Integer.parseInt(args[0]);
            while(count < i){
                n = Integer.parseInt(args[count]); 
                sum += n;
                if(min > n)
                    min = n; 
                if (max < n)
                    max = n; count += 1;
            }
            avg = sum/i; 
            System.out.println("sum =" +sum); 
            System.out.println( "avg=" +avg); 
            System.out.println("max=" +max); 
            System.out.println("min=" +min);
        }
    }
}
