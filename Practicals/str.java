public class str {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(s.length());
        StringBuffer s1=new StringBuffer();
        System.out.println(s1.capacity());
        s1.append("world");
        System.out.println(s1.capacity());

        StringBuffer s2=new StringBuffer("world");
        System.out.println(s2.capacity());
    }
}
