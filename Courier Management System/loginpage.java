import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class loginpage extends JFrame implements ActionListener
{
	JLabel lheading,lemail,lpass,limg;
	JTextField temail;
	JPasswordField tpass;
	JButton btnlog,btnback,btnReg;

	Connection con;
	Statement st;
	
	loginpage()
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

		lheading=new JLabel("LOGIN");
		lemail=new JLabel("Email ID:"); 
		lpass=new JLabel("Password:");

		limg = new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/menu.jpg"));
		temail = new JTextField(20); 
		tpass = new JPasswordField(20);

		btnlog = new JButton("Login");
		btnReg=new JButton("New User");
		btnback=new JButton("Back");

		add(limg);
		limg.add(lheading);
		limg.add(lemail);
		limg.add(temail);
		limg.add(lpass);
		limg.add(tpass);
		limg.add(btnlog);
		limg.add(btnReg);
		limg.add(btnback);
		
		lheading.setFont(new Font("Algerian",Font.BOLD,60));
		lemail.setFont(new Font("Arial black",Font.BOLD,20));
		lpass.setFont(new Font("Arial black",Font.BOLD,20));

		btnlog.setFont(new Font("Arial black",Font.BOLD,20));
		btnback.setFont(new Font("Arial black",Font.BOLD,20));
		btnReg.setFont(new Font("Arial black",Font.BOLD,20));

	
		limg.setBounds(0,0,1500,1200);
		lheading.setBounds(600,120,300,50);		
		lemail.setBounds(400,250,350,40);
		temail.setBounds(530,250,350,40);

		lpass.setBounds(400,380,350,40);
		tpass.setBounds(530,380,350,40);

		btnlog.setBounds(490,560,170,60);
		btnReg.setBounds(700,560,170,60);
		btnback.setBounds(1200,850,150,60);
			

		setLayout(null);
		
		setBackground(Color.lightGray);

		btnlog.addActionListener(this);
		btnback.addActionListener(this);
		btnReg.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnlog)
		{
			try
			{
				ResultSet rs=st.executeQuery("select * from login where mail='"+temail.getText()+"'and pass='"+tpass.getText()+"'");
				if(rs.next())
				{
					JOptionPane.showMessageDialog(this,"valid User...","Login",JOptionPane.INFORMATION_MESSAGE);

					temail.setText("");tpass.setText("");
					
					Menupage obj=new Menupage();
					obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
					obj.setIconImage(icon);
					obj.setSize(1500,1500);
					obj.setVisible(true);					

					
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Invalid User...","Login",JOptionPane.ERROR_MESSAGE);

					temail.setText("");tpass.setText("");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==btnReg)
		{
			Registration r = new Registration();
					Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
					r.setIconImage(icon);
					r.setSize(1500,1500);
					r.setVisible(true);
					dispose();
		}
		
		if(ae.getSource()==btnback)
		{
			homepage obj=new homepage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
			
		}
		
	}
	public static void main(String[] ar)
	{
		loginpage obj = new loginpage();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
		
	}
}