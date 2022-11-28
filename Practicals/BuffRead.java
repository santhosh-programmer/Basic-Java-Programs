import java.io.*;  
public class BuffRead{    
 public static void main(String args[]){    
  try{    
    BufferedInputStream r=new BufferedInputStream(new FileInputStream("D:\\java learning\\practical\\testout.txt"));    
    int i;    
    while((i=r.read())!=-1){    
     System.out.print((char)i);    
    }    
    r.close();        
  }catch(Exception e){System.out.println(e);}    
 }    
}  