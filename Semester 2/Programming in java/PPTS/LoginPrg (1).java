import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginPrg extends JFrame implements ActionListener
{
   JLabel l1,l2,l3;
   JTextField t1;
   JButton b1,b2;
   JPasswordField t2;
   LoginPrg()
   {
      setTitle("Login");
      this.getContentPane().setBackground(Color.PINK);
      l1=new JLabel("Enter User Name");
      l2=new JLabel("Enter PassWord");
      l3=new JLabel("checking");
      t1=new JTextField();
      t2=new JPasswordField();
      b1=new JButton("Login");
      b2=new JButton("Exit");
      Font f=new Font("Lucida Console",Font.BOLD,14);
      setLayout(null);
      l1.setFont(f);l2.setFont(f);t1.setFont(f);t2.setFont(f);b1.setFont(f);l3.setFont(f);
      l1.setBounds(50,50,150,25);t1.setBounds(250,50,100,25);
         l2.setBounds(50,100,150,25);t2.setBounds(250,100,100,25);
          b1.setBounds(50,150,150,25);b2.setBounds(250,150,100,25);
          l3.setBounds(50,200,250,25);
         add(l1);add(t1);
         add(l2);add(t2);
         add(b1);add(b2);
         add(l3);
         b1.addActionListener(this);
         b2.addActionListener(this);
      //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {

       if(ae.getSource()==b1)
        {
           String s1=t1.getText();

            String s2=t2.getText();
            if((s1.equals("hello"))&&(s2.equals("world")))
             {
               l3.setText("Valid User");
              }
              else
              {
                l3.setText("In Valid User");
              }
         }
	else
        {
		System.exit(0);
	}
     }
    public static void main(String args[])
    {
     LoginPrg obj=new LoginPrg();
     obj.setSize(800,400);
     obj.setVisible(true);
     obj.setLocation(100,100);
     obj.setDefaultCloseOperation(obj.EXIT_ON_CLOSE);
     }
}
