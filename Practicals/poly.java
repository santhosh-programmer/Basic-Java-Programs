class shape {
    void getShape() {
        System.out.println("This is a shape");
    }
    void hi()
    {
        System.out.println("hi");
    }
}
class circle extends shape{
    void getShape() {
        System.out.println("This is circle");
    }
}
class rectangle extends shape {
    void getShape() {
        System.out.println("This is rectangle");
    }
}
class triangle extends shape {
    void getShape() {
        System.out.println("This is triangle");
    }
}
public class poly {
    public static void main(String[] args) {
        shape s=new shape();
        shape c=new circle();
        shape r=new rectangle();
        shape t=new triangle();
        s.getShape();
        c.getShape();
        r.getShape();
        t.getShape();
    }
}
