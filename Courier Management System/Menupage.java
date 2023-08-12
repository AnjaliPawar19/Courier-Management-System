import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Menupage extends JFrame implements ActionListener
{
	JLabel limg;
	JButton btnb1,btnb2,btnb4,btnb5;
	

	Menupage()
	{

		btnb1=new JButton("Place New Orders");
		btnb2=new JButton("See Previous Orders");
		btnb4=new JButton("Account");
		btnb5=new JButton("Back");
		limg=new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/menu.jpg"));

		add(limg);
		limg.add(btnb1);limg.add(btnb2);limg.add(btnb4);limg.add(btnb5);

		btnb1.setFont(new Font("Arial black",Font.BOLD,30));
		btnb2.setFont(new Font("Arial black",Font.BOLD,30));
		btnb4.setFont(new Font("Arial black",Font.BOLD,30));
		btnb5.setFont(new Font("Arial black",Font.BOLD,20));

		
		limg.setBounds(0,0,1500,1200);
		btnb1.setBounds(500,180,500,80);
		btnb2.setBounds(500,330,500,80);
		btnb4.setBounds(500,480,500,80);
		btnb5.setBounds(1220,820,150,60);		

		setLayout(null);
		//btnb1.setBackground(Color.lightGray);
		//btnb2.setBackground(Color.lightGray);
		//btnb4.setBackground(Color.lightGray);
		
		
		btnb1.addActionListener(this);
		btnb5.addActionListener(this);
		btnb2.addActionListener(this);
		btnb4.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnb1)
		{
			frame_4 f4 = new frame_4();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			f4.setIconImage(icon);
			f4.setSize(1500,1500);
			f4.setVisible(true);
			dispose();
		}
		if(ae.getSource()==btnb5)
		{
			loginpage obj = new loginpage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
		if(ae.getSource()==btnb2)
		{
			previous obj = new previous();
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
		if(ae.getSource()==btnb4)
		{
			account obj = new account();
			Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
			obj.setIconImage(icon);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
	}
	
	public static void main(String [] ar)
	{
		Menupage obj=new Menupage();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}