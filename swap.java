public class swap {
    public static void main(String[] args) {
        float first = Float.parseFloat(args[0]), second = Float.parseFloat(args[1]);
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}