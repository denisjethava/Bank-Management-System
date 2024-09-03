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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,lblimg;
	JTextField tfname,tffathername,tfemail,tfadd,tfcity,tfpincode,tfstate;
	JRadioButton rbtmale,rbtfemale,rbtmrd,rbtunmrd;
	JDateChooser datechooser;
	JButton btnnext;	
	
	Random r=new Random();
	long randno=r.nextLong()%9000;	//Long Digit Into Short Digit.
	String no=" "+Math.abs(randno);	//Negetive No Into Positive No.
	
	public SignUp()
	{
		setTitle("New Accoutn Application Form");
		setLayout(null);
		
		//Main Title. 
			
				//Frame Icon.
				Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
				this.setIconImage(i);
				
				ImageIcon i1=new ImageIcon("simple2.jpg");
				lblimg=new JLabel(i1);	
				lblimg.setBounds(0,0,800,750);
				add(lblimg);

				l1=new JLabel("Page-1 : Personal Deatails :- " +no);
				l1.setBounds(200,12,600,40);
				Font f1=new Font("Tahoma",Font.BOLD,25);
				l1.setForeground(Color.WHITE);
				l1.setFont(f1);			
				lblimg.add(l1);

				l2=new JLabel("Personal Details For Customer");
				l2.setBounds(200,60,600,40);
				Font f2=new Font("Tahoma",Font.BOLD,25);
				l2.setForeground(Color.WHITE);
				l2.setFont(f2);			
				lblimg.add(l2);
				
				l3=new JLabel("Your Name");
				l3.setFont(new Font("Arial",Font.BOLD,20));
				l3.setForeground(Color.WHITE);
				l3.setBounds(100,130,200,30);
				lblimg.add(l3);

				tfname=new JTextField(15);					//TextField
				tfname.setFont(new Font("Arial",Font.BOLD,15));
				tfname.setBounds(300,130,300,30);
				lblimg.add(tfname);

					
				l4=new JLabel("Father Name");
				l4.setFont(new Font("Arial",Font.BOLD,20));
				l4.setForeground(Color.WHITE);
				l4.setBounds(100,180,200,30);
				lblimg.add(l4);

				tffathername=new JTextField(15);					//TextField
				tffathername.setFont(new Font("Arial",Font.BOLD,15));
				tffathername.setBounds(300,180,300,30);
				lblimg.add(tffathername);
				
				
				l5=new JLabel("Date Of Birth");
				l5.setFont(new Font("Arial",Font.BOLD,20));
				l5.setForeground(Color.WHITE);
				l5.setBounds(100,230,200,30);
				lblimg.add(l5);
				
				datechooser=new JDateChooser();
				datechooser.setBounds(300,225,200,40);
				lblimg.add(datechooser);
				
				
				l6=new JLabel("Gender");
				l6.setFont(new Font("Arial",Font.BOLD,20));
				l6.setForeground(Color.WHITE);
				l6.setBounds(100,280,200,30);
				lblimg.add(l6);
				
				rbtmale=new JRadioButton("Male");
				rbtmale.setFont(new Font("Arial",Font.BOLD,20));
				rbtmale.setBounds(300,280,100,30);
				lblimg.add(rbtmale);
				
				rbtfemale=new JRadioButton("Female");
				rbtfemale.setFont(new Font("Arial",Font.BOLD,20));
				rbtfemale.setBounds(470,280,100,30);
				lblimg.add(rbtfemale);

				ButtonGroup bg=new ButtonGroup();
				bg.add(rbtmale);	
				bg.add(rbtfemale);

				l7=new JLabel("Email-Address");
				l7.setFont(new Font("Arial",Font.BOLD,20));
				l7.setForeground(Color.WHITE);
				l7.setBounds(100,330,200,30);
				lblimg.add(l7);

				tfemail=new JTextField(15);					//TextField
				tfemail.setFont(new Font("Arial",Font.BOLD,15));
				tfemail.setBounds(300,330,300,30);
				lblimg.add(tfemail);
									

				l8=new JLabel("Marital Status");
				l8.setFont(new Font("Arial",Font.BOLD,20));
				l8.setForeground(Color.WHITE);
				l8.setBounds(100,380,200,30);
				lblimg.add(l8);
				
				rbtmrd=new JRadioButton("Married");
				rbtmrd.setFont(new Font("Arial",Font.BOLD,20));
				rbtmrd.setBounds(300,380,100,30);
				lblimg.add(rbtmrd);
				
				rbtunmrd=new JRadioButton("UnMarried");
				rbtunmrd.setFont(new Font("Arial",Font.BOLD,20));
				rbtunmrd.setBounds(470,380,130,30);
				lblimg.add(rbtunmrd);

				ButtonGroup bg1=new ButtonGroup();
				bg1.add(rbtmrd);	
				bg1.add(rbtunmrd);



				l9=new JLabel("Address");
				l9.setFont(new Font("Arial",Font.BOLD,20));
				l9.setForeground(Color.WHITE);
				l9.setBounds(100,430,200,30);
				lblimg.add(l9);

				tfadd=new JTextField(15);					//TextField
				tfadd.setFont(new Font("Arial",Font.BOLD,15));
				tfadd.setBounds(300,430,300,30);
				lblimg.add(tfadd);


				l10=new JLabel("City");
				l10.setFont(new Font("Arial",Font.BOLD,20));
				l10.setForeground(Color.WHITE);
				l10.setBounds(100,480,200,30);
				lblimg.add(l10);

				tfcity=new JTextField(15);					//TextField
				tfcity.setFont(new Font("Arial",Font.BOLD,15));
				tfcity.setBounds(300,480,300,30);
				lblimg.add(tfcity);


				l11=new JLabel("Pin Code");
				l11.setFont(new Font("Arial",Font.BOLD,20));
				l11.setForeground(Color.WHITE);
				l11.setBounds(100,530,200,30);
				lblimg.add(l11);

				tfpincode=new JTextField(15);					//TextField
				tfpincode.setFont(new Font("Arial",Font.BOLD,15));
				tfpincode.setBounds(300,530,300,30);
				lblimg.add(tfpincode);


				l12=new JLabel("State");
				l12.setFont(new Font("Arial",Font.BOLD,20));
				l12.setForeground(Color.WHITE);
				l12.setBounds(100,580,200,30);
				lblimg.add(l12);

				tfstate=new JTextField(15);					//TextField
				tfstate.setFont(new Font("Arial",Font.BOLD,15));
				tfstate.setBounds(300,580,300,30);
				lblimg.add(tfstate);

				btnnext=new JButton("Next");
				btnnext.setFont(new Font("Arial",Font.BOLD,15));
				btnnext.setBackground(Color.WHITE);
				btnnext.setForeground(Color.BLACK);
				btnnext.setBounds(500,630,100,30);
				btnnext.addActionListener(this);
				lblimg.add(btnnext);
				
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocation(550,45);
		setSize(800,750);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnnext)
		{
			//getData As Above Filed.
			
			String formnum=no;
			String name=tfname.getText();
			String fname=tffathername.getText();		
			//getUiComponent=Method Of Chaining.
			String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
			String gender=null;
			if(rbtmale.isSelected())
			{
				gender="Male";
			}
			else if(rbtfemale.isSelected())
			{
				gender="Female";
			}
			String email=tfemail.getText();	
			String maritalstatus=null;
			if(rbtmrd.isSelected())
			{
				maritalstatus="Married";
			}
			else if(rbtunmrd.isSelected())
			{
				maritalstatus="Unmarried";
			}
			String address=tfadd.getText();
			String city=tfcity.getText();
			String pincode=tfpincode.getText();
			String state=tfstate.getText();
			
			
			//Print Data Into The Database (SignUp-Table).
			try
			{		

				if(tfname.getText().equals("") || tffathername.getText().equals("") || tfemail.getText().equals("") || 
						tfadd.getText().equals("")||tfcity.getText().equals("")||tfpincode.getText().equals("")||tfstate.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Fillup Blank Field");
				}
				else
				{
					ConnectionProject cp=new ConnectionProject();
					String query="insert into signup values('"+formnum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalstatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
					cp.stmt.executeUpdate(query);
					setVisible(false);
					new SignUpTwo(formnum).setVisible(true);
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new SignUp();
	}

}
