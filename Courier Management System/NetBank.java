import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NetBank extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b,btnback;

	Container con;

	NetBank()
	{
		con = getContentPane();
	
		l1 = new JLabel("Bank Holder Name:");
		l2 = new JLabel("Account Number:");
		l3 = new JLabel("IFSC Code:");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		
		b = new JButton("Next");
		btnback = new JButton("Back");

		con.add(l1);con.add(l2);con.add(l3);
		con.add(t1);con.add(t2);con.add(t3);
		con.add(b);con.add(btnback);

		l1.setBounds(100,150,300,30);
		l2.setBounds(100,220,300,30);
		l3.setBounds(100,290,300,30);

		t1.setBounds(300,150,200,30);
		t2.setBounds(300,220,200,30);
		t3.setBounds(300,290,200,30);

		b.setBounds(150,450,100,40);
		btnback.setBounds(360,450,100,40);

		con.setLayout(null);
		con.setBackground(Color.lightGray);		
		
	     l1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
	     l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	     l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b.addActionListener(this);
		btnback.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			dr obj = new dr();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();	
		}
		if(ae.getSource()==btnback)
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
		NetBank obj = new NetBank();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(800,600);
		obj.setVisible(true);
	}
}