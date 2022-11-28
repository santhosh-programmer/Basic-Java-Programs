import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class login implements ActionListener {
    JFrame f;
    JButton loginButton,signupButton;
    Connection con;
    Statement stmt;
    login()
    {
        try{

            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","SanthoshPassword");
                stmt=con.createStatement();
            }
            catch(Exception exp)
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","SanthoshPassword");
                stmt=con.createStatement();
                stmt.executeUpdate("CREATE DATABASE school");
                stmt.executeUpdate("""
                CREATE TABLE school.student
                (
                    name varchar(45) NOT NULL UNIQUE,
                    password varchar(45) NOT NULL
                );
                """);  
            } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        f=new JFrame("LOGIN PAGE");
        loginButton=new JButton("LOGIN");
        signupButton=new JButton("SIGN UP");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.add(loginButton);
        f.add(signupButton);
        loginButton.setBounds(100,80,100,20);
        signupButton.setBounds(100,150,100,20);
        loginButton.addActionListener(this);
        signupButton.addActionListener(this);
        
    }

    public void actionPerformed (ActionEvent e)
    {
        JFrame fr=new JFrame("LOGIN PAGE");
        JTextField name=new JTextField();
        JPasswordField password=new JPasswordField();
        JLabel nameLabel=new JLabel("ENTER USERNAME: ");
        JLabel passwordLabel=new JLabel("ENTER PASSWORD: ");

        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setLayout(null);
        fr.add(name);
        fr.add(password);
        fr.add(nameLabel);
        fr.add(passwordLabel);

        nameLabel.setBounds(50,100,150,20);
        passwordLabel.setBounds(50,170,150,20);
        name.setBounds(200,100,100,20);
        password.setBounds(200,170,100,20);

        if(e.getSource()==loginButton)
        {
                JButton l=new JButton("LOGIN");
                fr.add(l);
                l.setBounds(150,220,100,30);
                l.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                        
                        try{
                            String query="SELECT password FROM school.student WHERE name='"+name.getText()+"'";
                            ResultSet rs=stmt.executeQuery(query);
                            rs.next();
                            String t1=new String(password.getPassword());
                            String t2=rs.getString(1);
                            JLabel ans=new JLabel();
                            if(t1.equals(t2))
                            {
                                ans.setText("LOGIN SUCCESSFUL");
                            }
                            else {
                                ans.setText("LOGIN FAILED");
                            }
                            fr.add(ans);
                            ans.setBounds(150,280,200,20);
                        }
                        catch(Exception ex) {
                            System.out.println(ex);
                        }
                    }
                }
            );
        }
        else
        {
            JButton s=new JButton("SIGNUP");
            fr.add(s);
            s.setBounds(150,220,100,30);
            s.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    JLabel ans2=new JLabel();
                    try{
                        String p=new String(password.getPassword());
                        String query="INSERT INTO school.student(name,password) VALUES('"+name.getText()+"','"+p+"')";
                        stmt.executeUpdate(query);
                        ans2.setText("SIGNUP SUCCESSFUL");
                    }
                    catch(Exception ex) {
                        System.out.println(ex);
                        ans2.setText("SIGNUP FAILED");
                    }
                    fr.add(ans2);
                    ans2.setBounds(150,280,200,20);
                }
            
            });
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
