
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class jd1 extends JFrame implements ActionListener
{  
     Connection con=null;    
     Statement stmt=null;
     ResultSet rs;
     PreparedStatement pstmt;
      			 
     JLabel l1,l2,l3;
     JTextField t1,t2,t3;
     JButton b1,b2,b3,b4,b5,b6;
     
     JFrame jf;

     jd1()
     {
        jf=new JFrame("DataBaseProgramme");
        l1=new JLabel("Name");
        l2=new JLabel("RollNo.");
        l3=new JLabel("Marks.");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton("First");
        b2=new JButton("Add");
	b3=new JButton("Last");
	b4=new JButton("Exit");
	b5=new JButton("Delete");
	b6=new JButton("Update");
	jf.setLayout(null);

        l1.setBounds(50,25,75,25);t1.setBounds(150,25,75,25);
	l2.setBounds(50,55,75,25);t2.setBounds(150,55,75,25);
	l3.setBounds(50,85,75,25);t3.setBounds(150,85,75,25);
	b1.setBounds(50,115,75,25);b2.setBounds(150,115,75,25);
	b3.setBounds(50,150,75,25);b4.setBounds(150,150,75,25);
	b5.setBounds(50,185,75,25);b6.setBounds(150,185,75,25);

        jf.add(l1);jf.add(t1);
	jf.add(l2);jf.add(t2);
	jf.add(l3);jf.add(t3);
	jf.add(b1);jf.add(b2);
	jf.add(b3);jf.add(b4);
	jf.add(b5);jf.add(b6);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);

	jf.setSize(600,300);
	jf.setVisible(true);
      }
      public void actionPerformed(ActionEvent ae)
      {
	 if(ae.getSource()==b1)
	 {
			String n;
			int r;
    			int m;
    			
    			try
  			{
    			 
				

				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb","root","");  
				
				String q="SELECT sname,sroll,smark FROM student";   
    			  stmt=con.createStatement();
      			  rs=stmt.executeQuery(q);
      			  if(rs.next())
    			  {
       			   n=rs.getString("sname");
        		   r=rs.getInt("sroll");
         		   m=rs.getInt("smark");
          		   t1.setText(n);
			   t2.setText(" "+r);
			   t3.setText(" "+m);
   			  }
                          else
			  {
			   JOptionPane.showMessageDialog(this,"End of record");
                          }
			  con.close();
                          rs.close();
                          stmt.close();
	     			      
    			 }
			catch(Exception e){}
                       
		}
		else if(ae.getSource()==b4)
		{
			System.exit(0);
		}
                else if(ae.getSource()==b2)
                {

                      try
  			   {
    			     Class.forName("com.mysql.cj.jdbc.Driver");  
   
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb","root",""); 
			     String s=t1.getText();
    			     int r=Integer.parseInt(t2.getText());
			     int m=Integer.parseInt(t3.getText());    
    			     pstmt=con.prepareStatement("INSERT into student(sname,sroll,smark )values(?,?,?)");
      			     pstmt.setString(1,s);
			     pstmt.setInt(2,r);
			     pstmt.setInt(3,m);
                             pstmt.executeUpdate();
			     JOptionPane.showMessageDialog(this,"data Inserted");
			     con.close();
                             rs.close();
                             stmt.close();

			    }
			catch(Exception e){}

		}
                else if(ae.getSource()==b5)
                {

                      try
  			   {
    			     Class.forName("com.mysql.cj.jdbc.Driver");
   			     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb","root","");
			     String s=t1.getText();
			     pstmt=con.prepareStatement("Delete from student where sname=?");
      			     pstmt.setString(1,s);
			     pstmt.executeUpdate();
			     JOptionPane.showMessageDialog(this,"data deleted");
                             con.close();
                             rs.close();
                             stmt.close();

			    }
                            catch(Exception e){}
			      
                 }
         }
                             
	public static void main(String arg[])
	{
		jd1 obj=new jd1();
	}
}
    

//for compilation
//c:\TestJava\src>javac -classpath ..\lib\mysql-connector-j-8.0.32.jar;. jd1.java
//for execution
//c:\TestJava\src>java -classpath ..\lib\mysql-connector-j-8.0.32.jar;. jd1   
