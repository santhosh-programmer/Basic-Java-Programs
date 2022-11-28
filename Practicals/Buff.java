import java.io.*;  
public class Buff{    
public static void main(String args[])throws Exception{    
     BufferedOutputStream w=new BufferedOutputStream(new FileOutputStream("D:\\java learning\\practical\\testout.txt"));    
     String s="Hello World";    
     byte b[]=s.getBytes();    
     w.write(b);    
     System.out.println("After writing into file: ");  
     BufferedInputStream r=new BufferedInputStream(new FileInputStream("D:\\java learning\\practical\\testout.txt"));
     int i;
     while((i=r.read())!=-1)
     {
        System.out.println(i);
     }
     w.close();
     r.close();
}    
}  