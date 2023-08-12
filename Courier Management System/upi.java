import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class upi extends JFrame implements ActionListener
{
	JLabel l;
	JTextField t;
	JButton b,btnback;

	Container con;

	upi()
	{
		con = getContentPane();

		l = new JLabel("Enter Your UPI ID:");
		t = new JTextField(20);
		b = new JButton("NEXT");
		btnback = new JButton("Back");

		con.add(l);
		con.add(t);
		con.add(b);
		con.add(btnback);

	      l.setFont(new Font("Comic Sans MS",Font.BOLD,20));

		l.setBounds(120,220,400,30);
		t.setBounds(350,220,300,30);
		b.setBounds(280,500,100,40);
		btnback.setBounds(450,500,100,40);

		con.setLayout(null);
		con.setBackground(Color.lightGray);

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
		upi obj = new upi();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(800,600);
		obj.setVisible(true);
	}
}
