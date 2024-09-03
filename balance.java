package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class balance extends JFrame implements ActionListener 
{
	JTextField tf1;
	JButton okbutton,backbutton;
	JLabel imglbl,l1,l2,l3;	
	String pin;
	
	public balance(String pin)
	{
		this.pin=pin;
		setTitle("Current_Balance-Page");
		
		//Frame Icon.
		Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
		this.setIconImage(i);
		
		ImageIcon i1=new ImageIcon("atm.jpg");
		imglbl=new JLabel(i1);
		imglbl.setBounds(-5,-100,843,1040);
		add(imglbl);
		
		l1=new JLabel("Enter Pin Number Check The Current Balance.");
		l1.setFont(new Font("System",Font.BOLD,16));
		l1.setBounds(250,380,360,30);
		imglbl.add(l1);
		
		
		l3=new JLabel("Enter PinNo :-");
		l3.setFont(new Font("System",Font.BOLD,16));
		l3.setBounds(240,550,120,30);
		l3.setForeground(Color.WHITE);
		imglbl.add(l3);
		
		tf1=new JTextField(20);
		tf1.setFont(new Font("Raleway",Font.BOLD,22));
		tf1.setBounds(360,550,100,30);
		imglbl.add(tf1);
		
		okbutton=new JButton("Balance");
		okbutton.setBounds(240,600,100,30);
		okbutton.addActionListener(this);
		imglbl.add(okbutton);
		
		backbutton=new JButton("Back");
		backbutton.setBounds(360,600,100,30);
		backbutton.addActionListener(this);
		imglbl.add(backbutton);
		
		setLayout(null);
		setSize(843,800);
		setLocation(550,10);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
	
		try
		{		
			if(ae.getSource()==backbutton)
			{
				this.setVisible(false);
				new Transactions(pin).setVisible(true);
			}
			else if(tf1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Enter Pin Number");
			}
			else 
			{
				ConnectionProject cp=new ConnectionProject();
				String pinnum=tf1.getText();
				String query="select * from login where pin='"+pinnum+"' ";
				ResultSet rs=cp.stmt.executeQuery(query);
				
				if(rs.next())										
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","mysql");
					Statement stmt=con.createStatement();
					
					String query1="select * from depo where pin='"+pinnum+"'";
					ResultSet rs1 = cp.stmt.executeQuery(query1);
					
					Date date=new Date();
					int sum=0,sum1=0,total;
					
					while(rs1.next())
					{
						int amountdeposit=rs1.getInt("amount");
						sum+=amountdeposit;
					}
					
					 String query2="select * from withdraw where pin='"+pinnum+"'";
					 ResultSet rs2 = cp.stmt.executeQuery(query2);
					 
					 while(rs2.next())
					 {
						 	int amountwithdraw=rs2.getInt("amount");
						 	sum1+=amountwithdraw;
					 }	
					 
					 total=sum-sum1;
					 cp.stmt.executeUpdate("insert into balance values('"+pinnum+"','"+date+"','Current-Balance','"+total+"')");
					 cp.stmt.executeUpdate("insert into bank values('"+pinnum+"','"+date+"','Current-Balance','"+total+"')");
					 JOptionPane.showMessageDialog(null, "Rs." + " " + total + " "+ "Current Balance");
					 this.setVisible(false);
					 new Transactions(pin).setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Sorry ! Pin Is InCorrect");
					tf1.setText("");
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new balance("");
	}

}
