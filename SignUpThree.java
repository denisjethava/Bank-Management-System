package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpThree extends JFrame implements ActionListener 
{
	JLabel lbltitle,acctype,cardno,xnum,digitno,sentence1,fourdigit,sentence2,service,lblimg;
	JRadioButton accsave,fixdepo,acccurr,recurdepo;
	JCheckBox atmcard,intbank,mobbank,emailalerts;	
	JButton submit,cancel;
	String formno="";
	
	public SignUpThree(String formno)
	{
		this.formno=formno;
		setTitle("New Account Form-Page-3");
		setLayout(null);
		
		//Title Form.
		
				//Frame Icon.
				Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
				this.setIconImage(i);
				
				ImageIcon i1=new ImageIcon("simple2.jpg");
				lblimg=new JLabel(i1);	
				lblimg.setBounds(0,0,800,720);
				add(lblimg);
				
				lbltitle=new JLabel("Page-3 : Account Deatails");
				lbltitle.setBounds(250,20,400,40);
				Font f1=new Font("Arial",Font.BOLD,25);
				lbltitle.setForeground(Color.WHITE);
				lbltitle.setFont(f1);			
				lblimg.add(lbltitle);

				acctype=new JLabel("Account Type :-");
				acctype.setBounds(180,80,200,30);
				Font f2=new Font("Ralway",Font.BOLD,18);
				acctype.setForeground(Color.WHITE);
				acctype.setFont(f2);			
				lblimg.add(acctype);

				accsave=new JRadioButton("Saving Account");
				accsave.setBounds(180,120,175,30);
				accsave.setForeground(Color.BLACK);
				accsave.setFont(f2);			
				lblimg.add(accsave);
					
				fixdepo=new JRadioButton("Fixed Deposite Account");
				fixdepo.setBounds(400,120,240,30);
				fixdepo.setFont(f2);			
				fixdepo.setForeground(Color.BLACK);
				lblimg.add(fixdepo);

				acccurr=new JRadioButton("Current Account");
				acccurr.setBounds(180,170,175,30);
				acccurr.setForeground(Color.BLACK);
				acccurr.setFont(f2);			
				lblimg.add(acccurr);

				recurdepo=new JRadioButton("Recurring Deposite Account");
				recurdepo.setBounds(400,170,280,30);
				recurdepo.setForeground(Color.BLACK);
				recurdepo.setFont(f2);			
				lblimg.add(recurdepo);

				ButtonGroup btngrp=new ButtonGroup();
				btngrp.add(accsave);
				btngrp.add(fixdepo);
				btngrp.add(acccurr);
				btngrp.add(recurdepo);



				cardno=new JLabel("Card No :-");
				cardno.setBounds(180,230,100,30);
				cardno.setForeground(Color.WHITE);
				cardno.setFont(f2);			
				lblimg.add(cardno);
				
				xnum=new JLabel("XXXX-XXXX-XXXX-2147");
				xnum.setBounds(400,230,250,30);
				xnum.setForeground(Color.WHITE);
				xnum.setFont(f2);			
				lblimg.add(xnum);



				digitno=new JLabel("16-Digits No :-");
				digitno.setBounds(180,290,250,30);
				digitno.setForeground(Color.WHITE);
				digitno.setFont(f2);			
				lblimg.add(digitno);

				sentence1=new JLabel("[It Would Visible On ATM Card]");
				sentence1.setBounds(180,320,250,30);
				sentence1.setForeground(Color.WHITE);
				Font f3=new Font("Arial",Font.BOLD,14);
				sentence1.setFont(f3);			
				lblimg.add(sentence1);


				digitno=new JLabel("Pin-No :-");
				digitno.setBounds(180,380,100,30);
				digitno.setForeground(Color.WHITE);
				digitno.setFont(f2);			
				lblimg.add(digitno);

				fourdigit=new JLabel("XXXX");
				fourdigit.setBounds(400,380,100,30);
				fourdigit.setForeground(Color.WHITE);
				fourdigit.setFont(f2);			
				lblimg.add(fourdigit);

				sentence2=new JLabel("[Your 4-Digits Password]");
				sentence2.setBounds(180,410,175,30);
				sentence2.setForeground(Color.WHITE);
				sentence2.setFont(f3);			
				lblimg.add(sentence2);


				service=new JLabel("Service Required By You :-");
				service.setBounds(180,470,240,30);
				service.setForeground(Color.WHITE);
				service.setFont(f2);			
				lblimg.add(service);
				
				atmcard=new JCheckBox("ATM Card");
				atmcard.setBounds(180,510,120,30);
				atmcard.setForeground(Color.BLACK);
				Font f4=new Font("Arial",Font.BOLD,17);
				atmcard.setFont(f4);			
				lblimg.add(atmcard);
				
				intbank=new JCheckBox("Internet Banking");
				intbank.setBounds(400,510,165,30);
				intbank.setForeground(Color.BLACK);
				intbank.setFont(f4);			
				lblimg.add(intbank);

				mobbank=new JCheckBox("Mobile Banking");
				mobbank.setBounds(180,560,150,30);
				mobbank.setForeground(Color.BLACK);
				mobbank.setFont(f4);			
				lblimg.add(mobbank);
			
				emailalerts=new JCheckBox("Email Alerts");
				emailalerts.setBounds(400,560,130,30);
				emailalerts.setForeground(Color.BLACK);
				emailalerts.setFont(f4);			
				lblimg.add(emailalerts);



				submit=new JButton("Submit");
				submit.setBounds(230,620,100,30);	
				submit.setBackground(Color.WHITE);
				submit.setForeground(Color.BLACK);
				submit.addActionListener(this);
				submit.setFont(f2);			
				lblimg.add(submit);

				cancel=new JButton("Cancel");
				cancel.setBounds(400,620,100,30);
				cancel.setBackground(Color.WHITE);
				cancel.setForeground(Color.BLACK);
				cancel.addActionListener(this);
				cancel.setFont(f2);			
				lblimg.add(cancel);

		setSize(800,720);
		setLocation(550,55);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		//Check The What Select The User From RadioButton.
		
		String accounttype=null;
		if(accsave.isSelected())
		{
			accounttype="Saving Account";
		}
		else if(fixdepo.isSelected())
		{
			accounttype="Fixed Deposite Account";
		}
		else if(acccurr.isSelected())
		{
			accounttype="Current Account";
		}
		else if(recurdepo.isSelected())
		{
			accounttype="Recurring Deposite Account";
		}
		
		Random r=new Random();
		long num1=(r.nextLong()%900000L)+5040936000000000L;
		String cardnum=""+Math.abs(num1);
		
		long num2=(r.nextLong()%9000L)+1000L;
		String pinnum=""+Math.abs(num2);
		
		String facility="";
		if(atmcard.isSelected())
		{
			facility="ATM Card";
		}
		else if(intbank.isSelected())
		{
			facility="Internet Banking";
		}
		else if(mobbank.isSelected())
		{
			facility="Mobile Banking";
		}
		else if(emailalerts.isSelected())
		{
			facility="Email Alerts";
		}
		
		//Print The Data Into DataBase.
		try
		{
			if(ae.getSource()==submit)
			{
				if(!accsave.isSelected() && !fixdepo.isSelected() && !acccurr.isSelected() && !recurdepo.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Please Select Any One Account-Type");
					return;
				}
				else if(!atmcard.isSelected() && !intbank.isSelected() && !mobbank.isSelected() && !emailalerts.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Please Select Any One Service");
					return;
				}
				else
				{
					ConnectionProject cp=new ConnectionProject();
					String query1="insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnum+"','"+pinnum+"','"+facility+"')";
					String query2="insert into login values('"+formno+"','"+cardnum+"','"+pinnum+"')";
					cp.stmt.executeUpdate(query1);
					cp.stmt.executeUpdate(query2);
					JOptionPane.showMessageDialog(null, "Card Number :- " + cardnum + "\n"+ "Pin Number :- " + pinnum);
					this.setVisible(false);
					new Transactions(formno).setVisible(true);
				}
			}
			else if(ae.getSource()==cancel)
			{
				//System.exit(0);
				setVisible(false);
				new BMS().setVisible(true);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
			new SignUpThree("");
	}

}
