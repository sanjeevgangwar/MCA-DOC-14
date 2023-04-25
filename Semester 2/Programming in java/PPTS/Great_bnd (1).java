import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Great_bnd extends JApplet implements ActionListener
{  
     JLabel l1,l2,l3,l4,l5;
     JTextField t1,t2,t3;
     JButton b1,b2;
     
     JFrame jf;
     Great_bnd()
     {
       jf=new JFrame("Greatest Of three number");
       l1=new JLabel("Enter First number");
        l2=new JLabel("Enter Second number");
	l3=new JLabel("Enter third number");
      l1.setForeground(Color.blue);
       l4=new JLabel("Result");
       l5=new JLabel();
        t1=new JTextField();

        t2=new JTextField();
         t3=new JTextField();
        b1=new JButton("OK");
        b2=new JButton("Exit");
        jf.setLayout(null);
         l1.setBounds(60,35,175,25);t1.setBounds(250,35,75,25);
         l2.setBounds(60,65,175,25);t2.setBounds(250,65,75,25);
         l3.setBounds(60,95,175,25);t3.setBounds(250,95,75,25);
         b1.setBounds(60,135,75,25);b2.setBounds(250,135,75,25);
         l4.setBounds(60,165,175,25);l5.setBounds(250,165,75,25);
       jf.add(l1);jf.add(t1);
	jf.add(l2);jf.add(t2);
	jf.add(l3);jf.add(t3);
	jf.add(b1);jf.add(b2);
	jf.add(l4);jf.add(l5);
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
			int x,y,z,max;
			x=Integer.parseInt(t1.getText());
			y=Integer.parseInt(t2.getText());
			z=Integer.parseInt(t3.getText());
			max=(x>y&&x>z)?x:((y>z)?y:z);
			l5.setText(" "+max);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String arg[])
	{
		Great_bnd obj=new Great_bnd();
	}
}
       
