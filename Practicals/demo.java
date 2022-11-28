import java.sql.*;
public class demo {
    public static void main(String[] args) {

    try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","SanthoshPassword");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("CREATE DATABASE company");
        stmt.executeUpdate("""
            CREATE TABLE company.employee
            (
                Id int NOT NULL UNIQUE,
                Name char(50) NOT NULL
            );

        """);
        System.out.println("Database created successfully");
        stmt.executeUpdate("INSERT INTO company.employee VALUES(101,'ram')");
        stmt.executeUpdate("INSERT INTO company.employee VALUES(102,'raaam')");
        ResultSet rs=stmt.executeQuery("SELECT * FROM company.employee");
        while(rs.next())
        {
            System.out.println("ID: "+rs.getInt(1)+" NAME: "+rs.getString(2));
        }
        stmt.executeUpdate(" UPDATE company.employee SET Name='raaaaaaam' WHERE Name='ram' ");
        ResultSet r=stmt.executeQuery("SELECT * FROM company.employee");
        System.out.println("After editing: ");
        while(r.next())
        {
            System.out.println("ID: "+r.getInt(1)+" NAME: "+r.getString(2));
        }
        stmt.executeUpdate("DELETE FROM company.employee WHERE Id=101");
        ResultSet s=stmt.executeQuery("SELECT * FROM company.employee");
        System.out.println("After deleting: ");
        while(s.next())
        {
            System.out.println("ID: "+s.getInt(1)+" NAME: "+s.getString(2));
        }


    }
    catch(Exception e) {
        System.out.println(e);
    }
}
}
