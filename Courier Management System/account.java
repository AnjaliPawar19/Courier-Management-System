import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class account extends JFrame implements ActionListener
{
	
	JLabel l,l1;
	JButton btnlogout,bback;

	account()
	{
		
																												l1=new JLabel("Terms & Conditions");						
		l=new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/acc.jpg"));
		

		

		btnlogout = new JButton("Log Out");
		bback = new JButton("Back");
		
		
		btnlogout.setFont(new Font("Arial Black",Font.BOLD,30));
		bback.setFont(new Font("Arial",Font.BOLD,20));
		l1.setFont(new Font("Arial",Font.BOLD,40));
		add(btnlogout);add(bback);
		add(l);
		add(l1);
		l.setBounds(20,90,1450,598);
		l1.setBounds(570,20,800,60);
		l.setBackground(Color.white);
		btnlogout.setBounds(600,700,200,70);
		bback.setBounds(1200,870,150,60);
		setLayout(null);

		bback.addActionListener(this);
		btnlogout.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bback)
		{
			Menupage obj=new Menupage();
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();	
		}
		if(ae.getSource()==btnlogout)
		{
			loginpage obj = new loginpage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();	
		}
	}
		
	public static void main(String[]ar)
	{
		account obj = new account();
		Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
		obj.setIconImage(icon);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}