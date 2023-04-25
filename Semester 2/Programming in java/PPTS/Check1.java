import java.sql.*;
public class Check1 {
	public static void main(String arg[])
	{
		
    		 PreparedStatement pstmt;
		
			 try
  			   {
    			     Class.forName("com.mysql.cj.jdbc.Driver");  
   
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb","root",""); 
			     String s="Vishal";
    			     int r=16;
			     int m=61;    
    			     pstmt=con.prepareStatement("INSERT into student(sname,sroll,smark )values(?,?,?)");
      			     pstmt.setString(1,s);
			     pstmt.setInt(2,r);
			     pstmt.setInt(3,m);
                             pstmt.executeUpdate();
			   
			     con.close();
                           
                             pstmt.close();

			    }
			catch(Exception e){}

	}

} // class ends
//for compilation
//c:\TestJava\src>javac -classpath ..\lib\mysql-connector-j-8.0.32.jar;. Check1.java
//for execution
//c:\TestJava\src>java -classpath ..\lib\mysql-connector-j-8.0.32.jar;. Check1
