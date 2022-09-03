class CalculateFactorial {
    public static void main(String args[]) { 
        int number;
        int fact = 1;
        int argsLength = args.length; 
        if(argsLength==1) {
        number = Integer.parseInt(args[0]);
        for(int count=1;count<=number;count++) { 
            fact = fact*count;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
        }
        else if(argsLength>1) {
        System.out.println("More than one number is entered...");
        }
    }
}
