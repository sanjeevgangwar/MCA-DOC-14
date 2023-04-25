import java.sql.*;
public class Check {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below  lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb","root", "");

			// stddb is database
			// root is username
			//  password is blank

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery("select * from student");
			int r;
			String n;
			while (resultSet.next()) {
				n = resultSet.getString("sname");
				r = resultSet.getInt("sroll");
				System.out.println("Name Of Student	:" + n+"RollNumber	: " + r);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends


//for compilation
//c:\TestJava\src>javac -classpath ..\lib\mysql-connector-j-8.0.32.jar;. Check.java
//for execution
//c:\TestJava\src>java -classpath ..\lib\mysql-connector-j-8.0.32.jar;. Check
