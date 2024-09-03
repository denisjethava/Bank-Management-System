package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener
{ 
	JLabel lblimg,lblimg2,lblimg3,logo;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	public Home()
	{
		setTitle("Bank Management System");
		setLayout(null);
		
		//Frame Icon.
		Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
		this.setIconImage(i);
		
		
	//	BackGround Image.
		ImageIcon i1=new ImageIcon("simple3.jpg");
		lblimg=new JLabel(i1);	
		lblimg.setBounds(0,0,1600,800);
		add(lblimg);
		
		
		//Bank Icon.
		ImageIcon i2=new ImageIcon("image2.png");
		lblimg2=new JLabel(i2);	
		lblimg2.setBounds(40,30,300,98);
		lblimg.add(lblimg2);
		
		
		//Login Icon.
		ImageIcon i3=new ImageIcon("icon1.png");
		l1=new JLabel(i3);	
		l1.setBounds(20,150,100,100);
		lblimg.add(l1);
		
		//Login-Button.
		b1=new JButton("Login");
		b1.setBounds(150,180,190,45);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.addActionListener(this);
		lblimg.add(b1);
		
		
		//Registration Icon.
		ImageIcon i4=new ImageIcon("icon2.png");
		l2=new JLabel(i4);	
		l2.setBounds(25,250,100,100);
		lblimg.add(l2);
		
		//Registration-Button.
		b2=new JButton("Registration");
		b2.setBounds(150,280,190,45);
		b2.setFont(new Font("Arial",Font.BOLD,25));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.addActionListener(this);
		lblimg.add(b2);
		
		
		//Transactions Icon.
		ImageIcon i5=new ImageIcon("icon3.png");
		l3=new JLabel(i5);	
		l3.setBounds(25,355,100,100);
		lblimg.add(l3);
		
		//Transactions-Button.
		b3=new JButton("Transactions");
		b3.setBounds(150,380,190,45);
		b3.setFont(new Font("Arial",Font.BOLD,25));
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.addActionListener(this);
		lblimg.add(b3);
		
		
		//Deposit Icon.
		ImageIcon i6=new ImageIcon("icon4.jpg");
		l4=new JLabel(i6);	
		l4.setBounds(25,458,100,100);
		lblimg.add(l4);
		
		//Deposit-Button.
		b4=new JButton("Deposite");
		b4.setBounds(150,480,190,45);
		b4.setFont(new Font("Arial",Font.BOLD,25));
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.BLACK);
		b4.addActionListener(this);
		lblimg.add(b4);
		
		
		//Withdraw Icon.
		ImageIcon i7=new ImageIcon("icon5.jpg");
		l5=new JLabel(i7);	
		l5.setBounds(25,550,100,100);
		lblimg.add(l5);
		
		//Withdraw-Button.
		b5=new JButton("Withdraw");
		b5.setBounds(150,580,190,45);
		b5.setFont(new Font("Arial",Font.BOLD,25));
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.BLACK);
		b5.addActionListener(this);
		lblimg.add(b5);
		
		
		//Balance Icon.
		ImageIcon i8=new ImageIcon("icon6.png");
		l6=new JLabel(i8);	
		l6.setBounds(25,650,100,100);
		lblimg.add(l6);
		
		//Balance-Button.
		b6=new JButton("Balance");
		b6.setBounds(150,680,190,45);
		b6.setFont(new Font("Arial",Font.BOLD,25));
		b6.setBackground(Color.WHITE);
		b6.setForeground(Color.BLACK);
		b6.addActionListener(this);
		lblimg.add(b6);	
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//getContentPane().setBackground(Color.GREEN);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			new BMS().setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			new SignUp().setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			new Transactions("").setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			new Deposit("").setVisible(true);
		}
		else if(ae.getSource()==b5)
		{
			new withdraw("").setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			new balance("").setVisible(true);
		}
	}
	
	public static void main(String[] args) 
	{
		new Home();
	}

}
