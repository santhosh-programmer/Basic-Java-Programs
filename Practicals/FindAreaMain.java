import java.util.Scanner;

interface Shape{
    int Area();
}
class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public int Area() {
        return l*b;
    }
}
class Square implements Shape{
    int s;
    Square(int s)
    {
        this.s=s;
    }
    @Override
    public int Area() {
        return s*s;
    }
}
class FindAreaMain {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter length and breadth of Rectangle: ");
        Rectangle r=new Rectangle(ob.nextInt(),ob.nextInt());
        System.out.println("Enter side of Square: ");
        Square s=new Square(ob.nextInt());
        System.out.println("Area of Rectangle: "+r.Area());
        System.out.println("Area of Square: "+s.Area());
        ob.close();
    }    
}

