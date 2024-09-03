package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener
{
	JTextField tf1,pintxt;
	JButton depositbutton,backbutton;
	JLabel imglbl,l1,l2,n1lbl,n2lbl;
	String pin;
	
	public Deposit(String pin)
	{
		this.pin=pin;
		setTitle("Deposit-Page");
		
		//Frame Icon.
		Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
		this.setIconImage(i);
		
		ImageIcon i1=new ImageIcon("atm.jpg");
		imglbl=new JLabel(i1);
		imglbl.setBounds(-5,-100,843,1040);
		add(imglbl);
		
		
		l1=new JLabel("Deposit Section.");
		l1.setFont(new Font("System",Font.BOLD,16));
		l1.setBounds(370,380,300,30);
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
		
		
		depositbutton=new JButton("Deposit");
		depositbutton.setBounds(240,630,100,30);
		depositbutton.addActionListener(this);
		imglbl.add(depositbutton);
		
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
			
			if(ae.getSource()==depositbutton)
			{
				ConnectionProject cp=new ConnectionProject();
				String query="select * from login where pin='"+pinnum+"' ";
				ResultSet rs=cp.stmt.executeQuery(query);
				
				if(rs.next())
				{
					if(tf1.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter Amount");
					}
					else
					{
						cp.stmt.executeUpdate("insert into bank values('"+pinnum+"','"+date+"','Deposit','"+amount+"')");
						cp.stmt.executeUpdate("insert into depo values('"+pinnum+"','"+date+"','Deposit','"+amount+"')");
						JOptionPane.showMessageDialog(null, "Rs." + " " + amount + " " + "Deposited Successfully");
						this.setVisible(false);
						new Transactions(pin).setVisible(true);
					}
				}
				else if(pintxt.getText().equals("") || tf1.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Please Fill-Up The TextField.");
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Pin Is InCorrect ! Please Enter Correct Pin.");
				}
			}
			else if(ae.getSource()==backbutton)
			{
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		new Deposit("");
	}

}