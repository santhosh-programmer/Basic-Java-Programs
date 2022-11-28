import javax.swing.*;  
import java.awt.event.*;  
public class Swing2 implements ActionListener{
    JFrame f;
    JButton b;
    JTextField no1,no2;
    JLabel ans;
    Swing2()
    {
        f=new JFrame("Addition of 2 numbers");
        b=new JButton("ADD");
        no1= new JTextField();
        no2=new JTextField();
        ans=new JLabel();
        f.add(b);
        f.add(no1);
        f.add(no2);
        f.add(ans);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        b.setBounds(140,170,80,20);
        b.addActionListener(this);
        no1.setBounds(100,100,200,20);
        no2.setBounds(100,140,200,20);
        ans.setBounds(150,250,100,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(no1.getText());
        int b=Integer.parseInt(no2.getText());
        ans.setText(new String("SUM: ").concat(String.valueOf(a+b)));
    }
    public static void main(String[] args) {
        new Swing2();
    }
}