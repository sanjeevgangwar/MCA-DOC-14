import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class T2 extends JFrame implements ActionListener
{  
     JLabel l1,l2,l3;
     JTextField t1;
     JButton b1,b2;
     JPanel p1;
     JFrame jf;
     T2()
     {
       l1=new JLabel("Enter any number");
       l2=new JLabel("Result");
       l3=new JLabel();
        t1=new JTextField();
        b1=new JButton("OK");
        b2=new JButton("Exit");
        jf=new JFrame("Demo of swing");
       p1=new JPanel(new GridLayout(3,2));
        p1.add(l1);p1.add(t1);p1.add(b1);p1.add(b2);p1.add(l2);p1.add(l3);
        jf.add(p1);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
	jf.setSize(300,300);
	jf.setVisible(true);
      }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int n,f,i;
			n=Integer.parseInt(t1.getText());
			f=1;
			for(i=1;i<=n;i++)
			{
				f=f*i;
			}
			l3.setText(""+f);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String arg[])
	{
		T2 obj=new T2();
	}
}
       
    