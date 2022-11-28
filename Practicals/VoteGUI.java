import javax.swing.*;
import java.awt.event.*;
public class VoteGUI{
    public static void main(String[] args) {
        JFrame f=new JFrame("Vote Eligibility");
        JLabel l=new JLabel("Enter Age: ");
        JTextField tf=new JTextField();
        JButton b=new JButton("CHECK");
        JLabel ans=new JLabel();
        f.add(l);f.add(tf);f.add(b);f.add(ans);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        l.setBounds(50,70,100,20);
        tf.setBounds(150,70,100,20);
        b.setBounds(100,140,100,30);
        ans.setBounds(100,200,200,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int a=Integer.parseInt(tf.getText());
                if(a>=18)
                ans.setText("ELIGIBLE");
                else
                ans.setText("NOT ELIGIBLE");
            }
        });
    }
}
