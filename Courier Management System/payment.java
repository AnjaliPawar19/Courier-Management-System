import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

class payment extends JFrame implements ActionListener
{
	JLabel l,limg;
	JButton b1,b2,b3,b4,btnback;
	
	///
	//JTextField  cname,cphn;
	//Connection con;
	//Container c;
	//Statement st;
	
	payment()
	{
		///
		

	
        		limg=new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/menu.jpg"));

		
		//
		/*cname = new JTextField(20);
		cphn = new JTextField(20);*/
		
		l = new JLabel("Select Your Payment Method");
		b1 = new JButton("UPI");
		b2 = new JButton("Net Banking");
		b3 = new JButton("Credit/Debit Card");
		b4 = new JButton("Cash On Dilevery");
		btnback = new JButton("Back");

		limg.add(l);add(limg);
		limg.add(b1);limg.add(b2);limg.add(b3);limg.add(b4);
		limg.add(btnback);

		///
		//limg.add(cname);limg.add(cphn);


		l.setFont(new Font("Elephant",Font.BOLD,40));
		b1.setFont(new Font("Arial black",Font.BOLD,20));
		b2.setFont(new Font("Arial black",Font.BOLD,20));
		b3.setFont(new Font("Arial black",Font.BOLD,20));
		b4.setFont(new Font("Arial black",Font.BOLD,20));
		btnback.setFont(new Font("Arial black",Font.BOLD,20));
		//cname.setVisible(false);
		//cphn.setVisible(false);
		
		///
		//cname.setBounds(500,500,100,40);
		//cphn.setBounds(500,500,100,40);
	

		limg.setBounds(0,0,1500,1200);
		l.setBounds(380,90,900,50);
		b1.setBounds(500,220,400,60);
		b2.setBounds(500,320,400,60);
		b3.setBounds(500,420,400,60);
		b4.setBounds(500,520,400,60);
		btnback.setBounds(1200,850,150,60);

		setLayout(null);
		setBackground(Color.lightGray);


		btnback.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}
	/*public void getdata()
	{
		try
			{
								con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","Anjali@123");
			
			c=getContentPane();
			
			st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select smno from frame4 where sname='"+cname.getText()+"'");
			System.out.println("abc");
				if(rs.next())
				{
					dr obj1 = new dr();
					Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
					obj1.setIconImage(icon);
					obj1.setSize(1500,1500);
					obj1.setVisible(true);
					dispose();
					cphn.setText(rs.getString(5));
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Record is not Available not...","Student",JOptionPane.ERROR_MESSAGE);
	


					//reset();
				}
	
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}*/
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnback)
		{
			Menupage obj=new Menupage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
		if(ae.getSource()==b1)
		{
			upi obj = new upi();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(800,600);
			obj.setVisible(true);
			dispose();
		}
		if(ae.getSource()==b2)
		{
			NetBank obj = new NetBank();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(800,600);
			obj.setVisible(true);
			dispose();
		}
		if(ae.getSource()==b3)
		{
			cvv obj = new cvv();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(800,600);
			obj.setVisible(true);	
			dispose();	
		}
		if(ae.getSource()==b4)
		{
			//getdata();	
			dr obj1 = new dr();
					Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
					obj1.setIconImage(icon);
					obj1.setSize(1500,1500);
					obj1.setVisible(true);
					dispose();
		}
	}

	public static void main(String[]ar)
	{
		payment obj = new payment();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}