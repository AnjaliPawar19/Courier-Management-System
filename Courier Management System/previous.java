import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;


class previous extends JFrame implements ActionListener
{
	JTable jt;
	Panel p1;
	JButton b1;

	Object[][] data=new Object[][] {};  
	ArrayList a1 = new ArrayList(); 
	DefaultTableModel dm;  
	ResultSetMetaData rd; 
	Connection con;
	Container c;
	Statement st;
	int cols=0;   

	previous()
	{
		b1=new JButton("Back");
		add(b1);
		
		b1.setFont(new Font("Arial black",Font.BOLD,20));
		b1.setBounds(1200,870,150,60);

		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","Anjali@123");


			c= getContentPane();
			st=con.createStatement();
			ResultSet rs1=st.executeQuery("select * from frame4");  
			dm=new DefaultTableModel();   
			rd=rs1.getMetaData();    
			cols=rd.getColumnCount();	
	
			String cname[]=new String[cols]; 
			for(int i=0; i<cols; i++)
			{
				cname[i]=rd.getColumnName(i+1);
				dm.addColumn(cname[i]);
			}
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}

		showTable();

		b1.addActionListener(this);

	} 
	
	void showTable() 
	{
		try
		{
			ResultSet rs = st.executeQuery("select * from frame4");
			rd = rs.getMetaData();
			Object rows[] = new Object[cols];
			while(rs.next())
			{
				for(int i=0;i<cols;i++)
				{
					rows[i]=rs.getString(i+1);
				}
				dm.addRow(rows);
			}
			jt = new JTable();
			jt.setModel(dm);
			p1 = new Panel();
			JScrollPane js=new JScrollPane(jt);

			p1.add(js);
			js.setBounds(0,50,1000,1000);
			//p1.setBounds(0,50,1000,1000);
			//p1.setPreferredSize(new Dimension(1500,1500));
			c.add(p1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Menupage obj=new Menupage();
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
			obj.setIconImage(icon);
			obj.setSize(1500,1500);
			obj.setVisible(true);
			dispose();
		}
	}

	public static void main(String[] ar)
	{
		previous obj = new previous();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Anjali Pawar/Desktop/Java Project/icon.png");
		obj.setIconImage(icon);
		obj.setSize(1500,1500);
		obj.setVisible(true);
	}
}