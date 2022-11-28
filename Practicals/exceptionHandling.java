public class exceptionHandling {
    public static void main(String[] args) {
        try{
            int a=5/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured\n"+"Message:"+ e.getMessage()+"\n");
        }
        try{
            String s=null;
            System.out.println(s.hashCode());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception occured\n"+"Message:"+ e.getMessage()+"\n");
        }
        try{
            String s="hi";
            int a=Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception occured\n"+"Message:"+ e.getMessage()+"\n");
        }
        try{
            int a[]=new int[10];
            System.out.println(a[40]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occured\n"+"Message:"+ e.getMessage()+"\n");
        }

    }
}
