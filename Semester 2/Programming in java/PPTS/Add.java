import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Add extends JFrame implements ActionListener
{  
     JLabel l1,l2,l3,l4;
     JTextField t1,t2;
     JButton b1,b2;
     
     JFrame jf;
     Add()
     {
     jf=new JFrame("Addition of Two Number");
       l1=new JLabel("Enter First number");
        l2=new JLabel("Enter Second number");
	
     	 l1.setForeground(Color.BLUE);
		l2.setForeground(Color.RED);
	jf.getContentPane().setBackground(Color.YELLOW);

       l3=new JLabel("Addition");
       l4=new JLabel();
        t1=new JTextField();

        t2=new JTextField();
         
        b1=new JButton("OK");
        b2=new JButton("Exit");
	b1.setForeground(Color.BLUE);
        jf.setLayout(null);
         l1.setBounds(60,35,175,25);t1.setBounds(250,35,75,25);
         l2.setBounds(60,65,175,25);t2.setBounds(250,65,75,25);
         l3.setBounds(60,95,175,25);l4.setBounds(250,95,75,25);
         b1.setBounds(60,135,75,25);b2.setBounds(250,135,75,25);
      
       jf.add(l1);jf.add(t1);
	jf.add(l2);jf.add(t2);
	jf.add(l3);jf.add(l4);
	jf.add(b1);jf.add(b2);
	 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
     b1.addActionListener(this);
    b2.addActionListener(this);
	jf.setSize(450,450);
	jf.setVisible(true);
      }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int x,y,z;
			x=Integer.parseInt(t1.getText());
			y=Integer.parseInt(t2.getText());
			z=x+y;
			l4.setText(" "+z);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String arg[])
	{
		Add obj=new Add();
	}
}
       
