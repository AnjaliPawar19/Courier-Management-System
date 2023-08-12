import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

class frame_4 extends JFrame implements ActionListener
{
	JLabel h1,h2,lname,lpin,lcity,ladd,lphn,lpt,lw,ld,g1,g2,s1,s2,n1,n2,limg;
	JTextField tname,tpin,tadd,tphn;
	JTextField tname2,tpin2,tadd2,tphn2;
	JButton btnsubmit,btnback;
	JComboBox j1,j2,j3,j4;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	Connection con;
	Statement st;

	
		String[] cc ={"Ahmedabad","Rajkot","Surat","Baroda","Gandhinagar"};
		String[] cc2 ={"Ahmedabad","Rajkot","Surat","Baroda","Gandhinagar"};
		String[] pt ={"Electronics","Books","Machine","Fabrics","Medicines"};
		String[] wc ={"1 to 5 kg","6 to 10 kg","11 to 15 kg","16 to 20 kg","21 to 25 kg","26 to 30 kg","More than 30 kg"};
		
	
	frame_4()
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


		h1 = new JLabel("Sender");
		h2 = new JLabel("Receiver");
		lname = new JLabel("Name:");	
		lpin = new JLabel("Pincode:");
		lcity = new JLabel("City:"); 
		ladd = new JLabel("Address:");
		lphn = new JLabel("Phone Number:");
		lpt = new JLabel("Parcel Type:");
		lw = new JLabel("Weight:");
		ld=new JLabel("Delivery Type:");

		g1=new JLabel("Time:24 Hrs");
		g2=new JLabel("Price:500Rs.");
		s1=new JLabel("Time: 2 Days");
		s2=new JLabel("Price:300Rs.");
		n1=new JLabel("Time:1 Week");
		n2=new JLabel("Price:150Rs.");

		limg = new JLabel(new ImageIcon("C:/Users/Anjali Pawar/Desktop/Java Project/menu.jpg"));

		tname = new JTextField(20);
		tpin = new JTextField(20);
		tadd = new JTextField(20);
		tphn = new JTextField(20);
		
		tname2 = new JTextField(20);
		tpin2 = new JTextField(20);
		tadd2 = new JTextField(20);
		tphn2 =new JTextField(20);

		j1 = new JComboBox(cc);
		j2 = new JComboBox(cc2);
		j3 = new JComboBox(pt);
		j4 = new JComboBox(wc);

		bg=new ButtonGroup();
		r1=new JRadioButton("Golden Delivery");
		r2=new JRadioButton("Silver Delivery");
		r3=new JRadioButton("Normal Delivery");
		bg.add(r1);bg.add(r2);bg.add(r3);
		
		btnsubmit = new JButton("Submit");
		btnback = new JButton("Back");

		add(limg);
		limg.add(h1);limg.add(h2);
		limg.add(lname);limg.add(tname);limg.add(tname2);
		limg.add(lpin);limg.add(tpin);limg.add(tpin2);
		limg.add(lcity); limg.add(j1); limg.add(j2);
		limg.add(ladd);limg.add(tadd);limg.add(tadd2);
		limg.add(lphn);limg.add(tphn);limg.add(tphn2);
		limg.add(lpt); limg.add(j3);
		limg.add(lw); limg.add(j4);limg.add(ld);
	      limg.add(btnsubmit);limg.add(btnback);
		limg.add(r1);limg.add(r2);limg.add(r3);
		limg.add(g1);limg.add(g2);limg.add(s1);limg.add(s2);limg.add(n1);limg.add(n2);
		
		h1.setFont(new Font("Elephant",Font.BOLD,40));
		h2.setFont(new Font("Elephant",Font.BOLD,40));

		lname.setFont(new Font("Arial black",Font.BOLD,20));
		tname.setFont(new Font("Arial black",Font.BOLD,20));
		tname2.setFont(new Font("Arial black",Font.BOLD,20));

		lpin.setFont(new Font("Arial black",Font.BOLD,20));
		tpin.setFont(new Font("Arial black",Font.BOLD,20));
		tpin2.setFont(new Font("Arial black",Font.BOLD,20));

		lcity.setFont(new Font("Arial black",Font.BOLD,20));
		j1.setFont(new Font("Arial black",Font.BOLD,20));
		j2.setFont(new Font("Arial black",Font.BOLD,20));

		ladd.setFont(new Font("Arial black",Font.BOLD,20));
		tadd.setFont(new Font("Arial black",Font.BOLD,20));
		tadd2.setFont(new Font("Arial black",Font.BOLD,20));

		lphn.setFont(new Font("Arial black",Font.BOLD,20));
		tphn.setFont(new Font("Arial black",Font.BOLD,20));
		tphn2.setFont(new Font("Arial black",Font.BOLD,20));

		lpt.setFont(new Font("Arial black",Font.BOLD,20));
		j3.setFont(new Font("Arial black",Font.BOLD,20));

		lw.setFont(new Font("Arial black",Font.BOLD,20));
		j4.setFont(new Font("Arial black",Font.BOLD,20));

		ld.setFont(new Font("Arial black",Font.BOLD,20));

		r1.setFont(new Font("Arial black",Font.BOLD,20));
		r2.setFont(new Font("Arial black",Font.BOLD,20));
		r3.setFont(new Font("Arial black",Font.BOLD,20));

		g1.setFont(new Font("Arial black",Font.BOLD,20));
		g2.setFont(new Font("Arial black",Font.BOLD,20));
		s1.setFont(new Font("Arial black",Font.BOLD,20));
		s2.setFont(new Font("Arial black",Font.BOLD,20));
		n1.setFont(new Font("Arial black",Font.BOLD,20));
		n2.setFont(new Font("Arial black",Font.BOLD,20));
		btnsubmit.setFont(new Font("Arial black",Font.BOLD,20));
		btnback.setFont(new Font("Arial black",Font.BOLD,20));
		
				

		limg.setBounds(0,0,1500,1200);
		h1.setBounds(500,100,200,40);
		h2.setBounds(900,100,200,40);
		
		lname.setBounds(270,190,200,30);
		tname.setBounds(450,190,300,30);
		tname2.setBounds(850,190,300,30);

		lpin.setBounds(270,250,200,30);
		tpin.setBounds(450,250,300,30);
		tpin2.setBounds(850,250,300,30);

		lcity.setBounds(270,310,200,30);
		j1.setBounds(450,310,300,30);
		j2.setBounds(850,310,300,30);

		ladd.setBounds(270,370,200,30);
		tadd.setBounds(450,370,300,30);
		tadd2.setBounds(850,370,300,30);

		lphn.setBounds(270,430,200,30);
		tphn.setBounds(450,430,300,30);
		tphn2.setBounds(850,430,300,30);

		lpt.setBounds(270,500,200,30);
		j3.setBounds(450,500,300,30);

		lw.setBounds(270,560,200,30);
		j4.setBounds(450,560,300,30);

		ld.setBounds(270,630,200,30);

		r1.setBounds(480,630,300,30);
		r2.setBounds(780,630,300,30);
		r3.setBounds(1080,630,300,30);

		g1.setBounds(500,660,300,30);
		g2.setBounds(500,690,300,30);
		s1.setBounds(800,660,300,30);
		s2.setBounds(800,690,300,30);
		n1.setBounds(1100,660,300,30);
		n2.setBounds(1100,690,300,30);

		
		btnsubmit.setBounds(550,850,150,60);
		btnback.setBounds(850,850,150,60);

		setLayout(null);	
		setBackground(Color.lightGray);

		btnback.addActionListener(this);
		btnsubmit.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnback)
		{
			Menupage mp=new Menupage();
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			mp.setIconImage(icon);
			mp.setSize(1500,1500);
			mp.setVisible(true);
			dispose();
		}
		if(ae.getSource()==btnsubmit)
		{

			try
			{
				String dt="";
				
				if(r1.isSelected())	
				{
					dt="Golden Delivery";
				}
				if(r2.isSelected())
				{
					dt="Silver Delivery";
				}
				if(r3.isSelected())
				{
					dt="Normal Delivery";
				}
			
				st.executeUpdate("insert into frame4 values('"+tname.getText()+"',"+tpin.getText()+", '"+j1.getItemAt(j1.getSelectedIndex())+"','"+tadd.getText()+"',"+tphn.getText()+",'"+j3.getItemAt(j3.getSelectedIndex())+"','"+j4.getItemAt(j4.getSelectedIndex())+"','"+dt+"','"+tname2.getText()+"',"+tpin2.getText()+",'"+j2.getItemAt(j2.getSelectedIndex())+"','"+tadd2.getText()+"',"+tphn2.getText()+")");

				

				JOptionPane.showMessageDialog(this,"Your Successfully Submited ...","Submited",JOptionPane.INFORMATION_MESSAGE);

				tname.setText("");tpin.setText("");tadd.setText("");tphn.setText("");
				tname2.setText("");tpin2.setText("");tadd2.setText("");tphn2.setText("");

				payment obj = new payment();
				Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
				obj.setIconImage(icon);
				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				obj.setSize(1500,1500);
				obj.setVisible(true);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			
		}
	}
	
	
	public static void main(String[]ar)
	{ 
		frame_4 obj = new frame_4();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}
