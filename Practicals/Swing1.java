import javax.swing.JButton;
import javax.swing.JFrame;
public class Swing1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton("LOGIN");
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
        b.setBounds(100,100,100,100);
        f.setSize(400,500);
    }
}
