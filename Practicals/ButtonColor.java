import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonColor implements ActionListener{
    JFrame f;
    JButton b1,b2,ans;
    JLabel l;

    ButtonColor()
    {
        f=new JFrame("COLOR CHANGER");
        b1=new JButton("Red");
        b2=new JButton("Green");
        ans=new JButton("BUTTON");
        l=new JLabel("Tap to change color");
        f.add(b1);f.add(b2);f.add(ans);f.add(l);
        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
        l.setBounds(100,50,200,20);
        b1.setBounds(70,100,100,30);
        b2.setBounds(230,100,100,30);
        ans.setBounds(150,200,100,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        ans.setBackground(Color.red);
        else
        ans.setBackground(Color.green);
    }
    public static void main(String[] args) {
        new ButtonColor();
    }
}
