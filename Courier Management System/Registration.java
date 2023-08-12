import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

class Registration extends JFrame implements ActionListener
{
	JLabel l,fn,ln,mno,eid,pass,req,lmsg,limg;
	JTextField tfn,tln,tmno,teid;
	JPasswordField tpass;
	JButton btnlog, btnback;
	JComboBox cb;
	Connection con;
	Statement st;
 	
	String[] re ={"Business Usage","Personal Usage","House Shifting Usage"};

	Registration()
	{

		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","Anjali@123");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		l=new JLabel("Registration");
		fn= new JLabel("First Name:");
		ln=new JLabel("Last Name:");
		mno=new JLabel("Phone Number:");
		eid=new JLabel("Email ID:");
		pass=new JLabel("Password");
		req=new JLabel("Requirement:");
		lmsg = new JLabel("Account has Created Successfully");
		limg=new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/menu.jpg"));
		
		tfn= new JTextField(20);
		tln=  new JTextField(20);
		tmno=  new JTextField(20);
		teid=  new JTextField(20);
		tpass=  new JPasswordField(20);
		
		btnlog = new JButton("Sign in");
		btnback = new JButton("Back");
	
		cb = new JComboBox(re);
		add(limg);
		limg.add(l);
		limg.add(fn);
		limg.add(tfn);
		limg.add(ln);
		limg.add(tln);
		limg.add(mno);
		limg.add(tmno);
		limg.add(eid);
		limg.add(teid);
		limg.add(pass);
		limg.add(tpass);
		limg.add(req);

		limg.add(cb);
		
		limg.add(btnlog);
		limg.add(btnback);
		
		l.setFont(new Font("Algerian",Font.BOLD,60));
		fn.setFont(new Font("Arial black",Font.BOLD,20));
		ln.setFont(new Font("Arial black",Font.BOLD,20));
		mno.setFont(new Font("Arial black",Font.BOLD,20));
		eid.setFont(new Font("Arial black",Font.BOLD,20));
		pass.setFont(new Font("Arial black",Font.BOLD,20));
		req.setFont(new Font("Arial black",Font.BOLD,20));
		btnlog.setFont(new Font("Arial black",Font.BOLD,20));
		btnback.setFont(new Font("Arial black",Font.BOLD,20));

		limg.setBounds(0,0,1500,1200);
		l.setBounds(300,60,500,50);

		fn.setBounds(250,200,300,30);
		tfn.setBounds(450,200,300,30);

		ln.setBounds(250,280,300,30);
		tln.setBounds(450,280,300,30);

		mno.setBounds(250,360,300,30);
		tmno.setBounds(450,360,300,30);

		eid.setBounds(250,440,300,30);
		teid.setBounds(450,440,300,30);

		pass.setBounds(250,520,300,30);
		tpass.setBounds(450,520,300,30);

		req.setBounds(250,600,300,30);
		cb.setBounds(450,600,300,30);

		btnlog.setBounds(310,750,150,60);
		btnback.setBounds(570,750,150,60);

		setLayout(null);
		setBackground(Color.lightGray);

		btnlog.addActionListener(this);
		btnback.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnlog)
		{
			try
			{
				st.executeUpdate("insert into registration values('"+tfn.getText()+"','"+tln.getText()+"', "+tmno.getText()+",'"+teid.getText()+"','"+tpass.getText()+"')");

				JOptionPane.showMessageDialog(this,"Register...","Login",JOptionPane.INFORMATION_MESSAGE);

				tfn.setText("");tln.setText("");tmno.setText("");teid.setText("");tpass.setText("");

				Menupage mp = new Menupage();
				Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
				mp.setIconImage(icon);
				mp.setSize(1500,1500);
				mp.setVisible(true);
				dispose();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		if(ae.getSource()==btnback)
		{
			loginpage obj = new loginpage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
			
		}		
	}	
	
	public static void main(String [] ar)
	{
		Registration obj=new Registration();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}
