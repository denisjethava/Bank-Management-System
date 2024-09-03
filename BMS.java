package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BMS extends JFrame implements ActionListener
{
	JLabel lblwel,lblcn,lblpn,lblimg,lbl;
	JTextField tfcardnum;
	JPasswordField pfpinnum;
	JButton btnlog,btncle,btnsign;
	
	public BMS()
	{
		setTitle("Login Page");
		setLayout(null);
		
		//Frame Icon.
		Image i=Toolkit.getDefaultToolkit().getImage("LoginFrameLogo.png");
		this.setIconImage(i);
		
		//Set Image.
		ImageIcon i1=new ImageIcon("image1.jpg");
		lblimg=new JLabel(i1);	
		lblimg.setBounds(0,0,800,500);
		add(lblimg);
		
//		lbl=new JLabel();
//		lbl.setBounds(200,200,200,30);
//		lblimg.add(lbl);
		
		lblwel=new JLabel("Welcome To Login Page");
		lblwel.setFont(new Font("Arial",Font.BOLD,40));
		lblwel.setBounds(160,40,530,50);
		lblwel.setForeground(Color.WHITE);
		lblimg.add(lblwel);

		lblcn=new JLabel("CardNo");
		lblcn.setFont(new Font("Tahoma",Font.BOLD,25));
		lblcn.setBounds(150,150,400,30);
		lblcn.setForeground(Color.WHITE);
		lblimg.add(lblcn);

		tfcardnum=new JTextField(20);
		tfcardnum.setFont(new Font("Tahoma",Font.BOLD,15));
		tfcardnum.setBounds(300,150,230,30);
		tfcardnum.setForeground(Color.BLACK);
		lblimg.add(tfcardnum);

		lblpn=new JLabel("PinNo");
		lblpn.setFont(new Font("Tahoma",Font.BOLD,25));
		lblpn.setBounds(150,250,400,30);
		lblpn.setForeground(Color.WHITE);
		lblimg.add(lblpn);

		pfpinnum=new JPasswordField(20);
		pfpinnum.setFont(new Font("Tahoma",Font.BOLD,15));
		pfpinnum.setBounds(300,250,230,30);
		pfpinnum.setForeground(Color.BLACK);
		lblimg.add(pfpinnum);

		btnlog=new JButton("Login");
		btnlog.setBackground(Color.WHITE);
		btnlog.setForeground(Color.BLACK);
		btnlog.setFont(new Font("Tahoma",Font.BOLD,15));
		btnlog.setBounds(300,320,100,40);
		btnlog.addActionListener(this);
		lblimg.add(btnlog); 

		btncle=new JButton("Clear");
		btncle.setBackground(Color.WHITE);
		btncle.setForeground(Color.BLACK);
		btncle.setFont(new Font("Tahoma",Font.BOLD,15));
		btncle.setBounds(410,320,100,40);
		btncle.addActionListener(this);
		lblimg.add(btncle);

		btnsign=new JButton("SignUp");
		btnsign.setBackground(Color.WHITE);
		btnsign.setForeground(Color.BLACK);
		btnsign.setFont(new Font("Tahoma",Font.BOLD,15));
		btnsign.setBounds(520,320,100,40);
		btnsign.addActionListener(this);
		lblimg.add(btnsign);		
		
		setLocation(550,150);
		setSize(800,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
			try
			{					       
				if(ae.getSource()==btnlog)
				{ 
					
					ConnectionProject cp=new ConnectionProject();
					String cardnum=tfcardnum.getText();
					String pinnum=pfpinnum.getText();
					
					String query="select * from login where cardno='"+cardnum+"' and pin='"+pinnum+"' ";
					ResultSet rs=cp.stmt.executeQuery(query);
					
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login SuccessFull , Welcome To Transaction");
						setVisible(false);
						new Transactions(pinnum).setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Either Card-Number Or Pin-Number Is Wrong.");
					}
				}
				else if(ae.getSource()==btncle)		
				{
					tfcardnum.setText("");
					pfpinnum.setText("");
					tfcardnum.requestFocus();
				}
				else if(ae.getSource()==btnsign)
				{
					this.setVisible(false);
					new SignUp();		//Connect The Signup-Page.
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
	public static void main(String args[])
	{
		new BMS();
	}

}
