package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdraw extends JFrame implements ActionListener
{

	JTextField tf1,pintxt;
	JButton withdrawbutton,backbutton;
	JLabel imglbl,l1,l2,n1lbl,n2lbl;
	String pin;
	
	public withdraw(String pin)
	{
		this.pin=pin;
		setTitle("WithDraw-Page");
		
		//Frame Icon.
		Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
		this.setIconImage(i);
		
		ImageIcon i1=new ImageIcon("atm.jpg");
		imglbl=new JLabel(i1);
		imglbl.setBounds(-5,-100,843,1040);
		add(imglbl);
		
		
		l1=new JLabel("WithDraw Section.");
		l1.setFont(new Font("System",Font.BOLD,16));
		l1.setBounds(350,380,300,30);
		imglbl.add(l1);
		
		
		n1lbl=new JLabel("Enter PinNum :- ");
		n1lbl.setFont(new Font("Raleway",Font.BOLD,15));
		n1lbl.setBounds(230,530,120,30);
		n1lbl.setForeground(Color.WHITE);
		imglbl.add(n1lbl);
		
		pintxt=new JTextField("");
		pintxt.setBounds(360,530,100,30);
		pintxt.setFont(new Font("Raleway",Font.BOLD,22));
		imglbl.add(pintxt);
		
		
		n2lbl=new JLabel("Enter Amount :- ");
		n2lbl.setFont(new Font("Raleway",Font.BOLD,15));
		n2lbl.setBounds(230,580,120,30);
		n2lbl.setForeground(Color.WHITE);
		imglbl.add(n2lbl);
		
		tf1=new JTextField();
		tf1.setFont(new Font("Raleway",Font.BOLD,22));
		tf1.setBounds(360,580,100,30);
		imglbl.add(tf1);

		
		withdrawbutton=new JButton("Withdraw");
		withdrawbutton.setBounds(240,630,100,30);
		withdrawbutton.addActionListener(this);
		imglbl.add(withdrawbutton);
		
		backbutton=new JButton("Back");
		backbutton.setBounds(360,630,100,30);
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
			String amount=tf1.getText();
			String pinnum=pintxt.getText();
			Date date=new Date();
			
			if(ae.getSource()==withdrawbutton)
			{
				if(pintxt.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Pin.");
				}
				else if(tf1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Amount.");
				}
				else
				{
					ConnectionProject cp=new ConnectionProject();
					String query="select * from balance where pin='"+pinnum+"' ";
					ResultSet rs=cp.stmt.executeQuery(query);
					int bal=0;
					while(rs.next())
					{
						if(rs.getString("type").equals("Current-Balance"))
						{
							bal+=Integer.parseInt(rs.getString("amount"));
						}
					}
					
					if(bal > Integer.parseInt(amount))
					{
						JOptionPane.showMessageDialog(null,"Insuffient Balance");
						return;
					}
					//System.out.print(pinnum+date+"withdraw"+amount);
					
					cp.stmt.executeUpdate("insert into bank values('"+pinnum+"','"+date+"','Withdraw','"+amount+"')");
					cp.stmt.executeUpdate("insert into withdraw values('"+pinnum+"','"+date+"','Withdraw','"+amount+"')");
					JOptionPane.showMessageDialog(null, "Rs." + " " + amount + " "+ "Withdraw Successfully");
					this.setVisible(false);
					new Transactions(pin).setVisible(true);
				}
			}
			else if(ae.getSource()==backbutton)
			{
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) 
	{
		new withdraw("");
	}

}
