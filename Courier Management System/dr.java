import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;
class dr extends JFrame implements ActionListener
{
	JLabel hdr,ci,name,email,phn,dd,da;
	JLabel cid,cdt,or,citem,total,cname,cphn;
	JLabel t1,t2;
	JLabel od,rb,add,it,su;
	JButton b;
	Connection con;
	Container c;
	Statement st;

	dr()
	{
		
			
		//payment obj=new payment();
		//obj.getdata();

		hdr = new JLabel("Delivery Receipt");
		ci = new JLabel("Customer Information");
		name = new JLabel("Name:");
		email = new JLabel("Email:");
		dd = new JLabel("Delivery Time:");
		phn = new JLabel("Phone:");
		da = new JLabel("Delivery Address:");
		t1 = new JLabel("Sector-2 nr GU");
		t2 = new JLabel("Sector-1 nr GU");
		

		od = new JLabel("Order Details");
		rb = new JLabel("Received By:");
		add = new JLabel("Address:");
		it = new JLabel("Item Type:");
		su = new JLabel("Subtotal:");
		
		b= new JButton("NEXT");

		//cname,cid,cphn,cdt,or,citem,total
		
		cname = new JLabel("mayank");
		cphn = new JLabel("7574001227");
		cid = new JLabel("mayank@gmail.com");
		cdt = new JLabel("24Hrs");
		or = new JLabel("xyz ");
		citem = new JLabel("Electronics");
		total=new JLabel("500RS.");

		c = getContentPane();

		c.add(hdr);c.add(ci);c.add(name);c.add(dd);c.add(email);
		c.add(da);c.add(phn);c.add(t1);

		c.add(od);c.add(rb);c.add(it);c.add(add);c.add(t2);c.add(su);c.add(b);

		
		c.add(cname);c.add(cid);c.add(cphn);c.add(cdt);c.add(or);c.add(citem);c.add(total);////

		hdr.setBounds(550,80,500,40);
		ci.setBounds(510,200,500,40);
		name.setBounds(400,280,100,40);
		cname.setBounds(520,280,300,40);  //
		dd.setBounds(800,280,300,40);
		cdt.setBounds(1000,280,300,40);   //
		email.setBounds(400,340,100,40);
		cid.setBounds(520,340,900,40);    //
		da.setBounds(800,340,300,40);
		phn.setBounds(400,400,100,40);
		cphn.setBounds(520,400,400,40);   //
		t1.setBounds(1030,320,300,80);

		od.setBounds(510,520,500,40);
		rb.setBounds(400,600,300,40);
		or.setBounds(570,600,300,40);   //
		it.setBounds(800,600,300,40);
		citem.setBounds(960,600,300,40);  //
		add.setBounds(400,660,300,40);
		su.setBounds(800,660,300,40);
		total.setBounds(940,660,300,40);
		t2.setBounds(540,640,300,80);
		b.setBounds(1200,870,150,60);
		
		
		hdr.setFont(new Font("Elephant",Font.BOLD,40));
		ci.setFont(new Font("Arial black",Font.BOLD,30));
		name.setFont(new Font("Arial black",Font.BOLD,20));
		dd.setFont(new Font("Arial black",Font.BOLD,20));
		email.setFont(new Font("Arial black",Font.BOLD,20));
		da.setFont(new Font("Arial black",Font.BOLD,20));
		phn.setFont(new Font("Arial black",Font.BOLD,20));
		od.setFont(new Font("Arial black",Font.BOLD,30));
		rb.setFont(new Font("Arial black",Font.BOLD,20));
		it.setFont(new Font("Arial black",Font.BOLD,20));
		add.setFont(new Font("Arial black",Font.BOLD,20));
		su.setFont(new Font("Arial black",Font.BOLD,20));
		b.setFont(new Font("Arial black",Font.BOLD,20));

		cname.setFont(new Font("Arial black",Font.BOLD,20));
		cid.setFont(new Font("Arial black",Font.BOLD,20));
		cphn.setFont(new Font("Arial black",Font.BOLD,20));
		or.setFont(new Font("Arial black",Font.BOLD,20));
		citem.setFont(new Font("Arial black",Font.BOLD,20));
		cdt.setFont(new Font("Arial black",Font.BOLD,20));
		t1.setFont(new Font("Arial black",Font.BOLD,20));
		t2.setFont(new Font("Arial black",Font.BOLD,20));
		total.setFont(new Font("Arial black",Font.BOLD,20));



		setLayout(null);

		c.setBackground(Color.lightGray);
		//c.setBackground(Color.white);


		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			tk obj=new tk();
			Image icon = Toolkit.getDefaultToolkit().getImage("icon.jpg");
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);	
			dispose();
		}
	}
	public static void main(String[] ar)
	{
		dr s1= new dr();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		s1.setIconImage(icon);
		s1.setSize(1500,1500);
		s1.setVisible(true);	
	}
}