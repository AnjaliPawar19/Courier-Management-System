import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class tk extends JFrame 
{
	JLabel limg;

	tk()
	{
		limg=new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/tk.jpg"));

		add(limg);

		limg.setBounds(0,0,1500,1000);

		setLayout(null);
	}
	public static void main(String [] ar)
	{
		tk obj=new tk();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
		
	}
}