import javax.swing.*;
public class Welcome {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JLabel l=new JLabel("VANAKKAM DI MAPPLAE");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.add(l);
        l.setBounds(70,100,200,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
