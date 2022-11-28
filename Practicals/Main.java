class userDefinedException extends Exception{
    userDefinedException(String s)
    {
        super(s);
    }
}
public class Main {
    public static void main(String[] args) {
        try{
            throw new userDefinedException("procedure for user defined exception");
        }
        catch(userDefinedException e)
        {
            System.out.println(e);
        }
    }
}
