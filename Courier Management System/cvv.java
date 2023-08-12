import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class cvv extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;

	Container con;

	cvv()
	{
		l1 = new JLabel("Enter Card No: ");
		l2 = new JLabel("Enter CVV:");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b1 = new JButton("NEXT");
		b2 = new JButton("BACK");
	
		con = getContentPane();

		con.add(l1);con.add(t1);
		con.add(l2);con.add(t2);
		con.add(b1);con.add(b2);
	
		l1.setBounds(100,150,300,40);
		t1.setBounds(300,150,300,40);

		l2.setBounds(100,250,300,40);
		t2.setBounds(300,250,300,40);
	
		b1.setBounds(200,400,100,40);
		b2.setBounds(500,400,100,40);
		
		con.setLayout(null);
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		con.setBackground(Color.lightGray);


		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			dr obj = new dr();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);	
			dispose();
		}
		if(ae.getSource()==b2)
		{
			payment obj = new payment();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
	}

	public static void main(String[]ar)
	{
		cvv obj = new cvv();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(800,600);
		obj.setVisible(true);	
	}
}