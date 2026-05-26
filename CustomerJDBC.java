import java.sql.*;

public class CustomerJDBC
{
    public static void main (String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

            while (rs.next())
            {
                System.out.println("Roll No: " + rs.getInt("cid")) ;
                System.out.println("Name : " + rs.getString("cname"));
                System.out.println("Marks : " + rs.getInt("pid"));
            }

            rs.close();
            stmt.close ();
            con.close ();
        }
        catch (Exception e)
        {
            System.out.println(" Exception occured : " + e);
        }
    }
}