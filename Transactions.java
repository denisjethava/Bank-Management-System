package Bank;
//import java.util.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener
{
	JLabel lblimg1,l1;
	JButton depositbutton1,wbutton2,bcbutton6,exitbutton7;
	String pin;
	
	public Transactions(String pin)
	{
		this.pin=pin;
		setTitle("Transaction Page");
		setLayout(null);
		
		ImageIcon i1=new ImageIcon("atm.jpg");
		lblimg1=new JLabel(i1);	
		lblimg1.setBounds(-5,-100,843,1040);
		add(lblimg1);
		
		l1=new JLabel("Please Select Your Transaction");
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Tahoma",Font.BOLD,18));
		l1.setBounds(280,380,300,30);
		lblimg1.add(l1);	//Background Back Label Is Show The Image On.
		
		
		depositbutton1=new JButton("Deposite");
		depositbutton1.setBounds(300,520,90,25);	
		depositbutton1.addActionListener(this);
		lblimg1.add(depositbutton1);

		wbutton2=new JButton("WithDraw");	
		wbutton2.setBounds(300,560,90,25);
		wbutton2.addActionListener(this);
		lblimg1.add(wbutton2);

		bcbutton6=new JButton("Balance-Chek"); 
		bcbutton6.setBounds(300,600,116,25);
		bcbutton6.addActionListener(this);
		lblimg1.add(bcbutton6);
		
		exitbutton7=new JButton("Exit");		
		exitbutton7.setBounds(300,640,70,25);
		exitbutton7.addActionListener(this);
		lblimg1.add(exitbutton7); 
				
		setUndecorated(true);	//Minimize-Maximize-Close Button Disable.
		setSize(843,800);
		setLocation(550,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==depositbutton1)
		{		
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
		else if(ae.getSource()==wbutton2)
		{
			setVisible(false);
			new withdraw(pin).setVisible(true);
		}
		else if(ae.getSource()==bcbutton6)
		{
			setVisible(false);
			new balance(pin).setVisible(true);
		}
		else if(ae.getSource()==exitbutton7)
		{
			System.exit(0);
			//new Home().setVisible(true);
		}
	}
	
	public static void main(String[] args)
	{
		new Transactions("");
	}

}
