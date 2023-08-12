import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class homepage extends JFrame implements ActionListener
{
	JLabel lblHeading,lblimg;
	JButton btnClick;
	

	homepage()
	{
		
		lblimg = new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/home.png.jpg"));

		lblHeading=new JLabel("Welcome To Our Courier Services");

		btnClick= new JButton("Click here...");

		 add(lblimg);
		lblimg.add(lblHeading);
		lblimg.add(btnClick);

		

		lblimg.setBounds(0,0,1600,1000);
		lblHeading.setBounds(180,100,1800,50);
		btnClick.setBounds(1250,900,200,60);	

		lblHeading.setFont(new Font("Algerian",Font.BOLD,60));
		btnClick.setFont(new Font("Arial black",Font.BOLD,20));
		lblHeading.setForeground(Color.black);	
		
		setLayout(null);

		setBackground(Color.lightGray);
		

		btnClick.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnClick)
		{
			loginpage l = new loginpage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			l.setIconImage(icon);
			l.setSize(1500,1500);
			l.setVisible(true);
			dispose();
		}
	}
	public static void main(String [] ar)
	{
		homepage obj=new homepage();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}