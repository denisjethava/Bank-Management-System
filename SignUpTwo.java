package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpTwo extends JFrame implements ActionListener
{
	JLabel lbladditional,lblreligion,lblcat,lblincome,lblqua,lblocc,lblimg;
	JLabel lblpanno,lbladhar,lblcitizon,lblaccount,lblformno,lblform,lblformvalue;
	JButton next2;
	JTextField tfpan,tfadhar;
	JComboBox CBReligion,CBCategory,CBIncome,CBEducation,CBOccupation;
	JRadioButton ctyes,ctno,accyes,accno;
	String formnum="";
	
	public SignUpTwo(String formnum)
	{
		this.formnum=formnum;
		setTitle("New Account Form-Page-2");
		Font f=new Font("Tahoma",Font.BOLD,18);
		setLayout(null);
				
		// Title Form-2.

				//Frame Icon.
				Image i=Toolkit.getDefaultToolkit().getImage("cbilogo.jpeg");
				this.setIconImage(i);
				
				ImageIcon i1=new ImageIcon("simple2.jpg");
				lblimg=new JLabel(i1);	
				lblimg.setBounds(0,0,780,650);
				add(lblimg);
		 		
				
				lbladditional=new JLabel("Page-2 : Additional Deatails"	+formnum);
				lbladditional.setBounds(200,12,600,40);
				Font f1=new Font("Tahoma",Font.BOLD,25);
				lbladditional.setForeground(Color.WHITE);
				lbladditional.setFont(f1);			
				lblimg.add(lbladditional);
				
		//Start Fill Details.

				lblreligion=new JLabel("Religion");
				lblreligion.setBounds(150,70,200,40);
				lblreligion.setForeground(Color.WHITE);
				lblreligion.setFont(f);			
				lblimg.add(lblreligion);
				
				String[] rel={"Select","Hindu","Muslim","Sikh","Christin","Jain","Charch","Others"};
				CBReligion=new JComboBox(rel);
				CBReligion.setForeground(Color.BLACK);
				CBReligion.setBackground(Color.WHITE);
				CBReligion.setFont(new Font("Arial",Font.BOLD,15));	
				CBReligion.setBounds(350,75,150,30);
				lblimg.add(CBReligion);		



				lblcat=new JLabel("Category");
				lblcat.setBounds(150,120,200,40);
				lblcat.setForeground(Color.WHITE);
				lblcat.setFont(f);			
				lblimg.add(lblcat);

				String[] category={"Select","General","Obc","Sc","St","Others"};
				CBCategory=new JComboBox(category);
				CBCategory.setForeground(Color.BLACK);
				CBCategory.setBackground(Color.WHITE);
				CBCategory.setFont(new Font("Arial",Font.BOLD,15));	
				CBCategory.setBounds(350,130,150,30);
				lblimg.add(CBCategory);

				

				lblincome=new JLabel("Income");
				lblincome.setBounds(150,170,200,40);
				lblincome.setForeground(Color.WHITE);
				lblincome.setFont(f);			
				lblimg.add(lblincome);

				String[] inc={"Select","<10,000","<50,000","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
				CBIncome=new JComboBox(inc);
				CBIncome.setBackground(Color.WHITE);
				CBIncome.setFont(new Font("Arial",Font.BOLD,15));	
				CBIncome.setBounds(350,180,150,30);
				CBIncome.setForeground(Color.BLACK);
				lblimg.add(CBIncome);
				
				

				lblqua=new JLabel("Qualification");
				lblqua.setBounds(150,220,200,40);
				lblqua.setForeground(Color.WHITE);
				lblqua.setFont(f);			
				lblimg.add(lblqua);

				String[] edu={"Select","Graduate","Non-Graduate","Post-Graduate","Others"};
				CBEducation=new JComboBox(edu);
				CBEducation.setBackground(Color.WHITE);
				CBEducation.setFont(new Font("Arial",Font.BOLD,15));	
				CBEducation.setBounds(350,230,150,30);
				CBEducation.setForeground(Color.BLACK);
				lblimg.add(CBEducation);



				lblocc=new JLabel("Occupation");
				lblocc.setBounds(150,270,200,40);
				lblocc.setForeground(Color.WHITE);
				lblocc.setFont(f);			
				lblimg.add(lblocc);

				String[] occ={"Select","Salaried","Self-Employmed","Business","Student","Retried","Others"};
				CBOccupation=new JComboBox(occ);
				CBOccupation.setBackground(Color.WHITE);
				CBOccupation.setForeground(Color.BLACK);
				CBOccupation.setFont(new Font("Arial",Font.BOLD,15));	
				CBOccupation.setBounds(350,280,150,30);
				lblimg.add(CBOccupation);



				lblpanno=new JLabel("PanCard-No");
				lblpanno.setBounds(150,320,200,40);
				lblpanno.setForeground(Color.WHITE);
				lblpanno.setFont(f);			
				lblimg.add(lblpanno);

				tfpan=new JTextField(20);
				tfpan.setFont(new Font("Arial",Font.BOLD,15));
				tfpan.setBounds(350,328,150,30);
				tfpan.setForeground(Color.BLACK);
				lblimg.add(tfpan);



				lbladhar=new JLabel("AdharCard-No");
				lbladhar.setBounds(150,370,200,40);
				lbladhar.setForeground(Color.WHITE);
				lbladhar.setFont(f);			
				lblimg.add(lbladhar);

				tfadhar=new JTextField(20);
				tfadhar.setFont(new Font("Arial",Font.BOLD,15));
				tfadhar.setBounds(350,375,150,30);
				lbladhar.setForeground(Color.WHITE);
				lblimg.add(tfadhar);
					


				lblcitizon=new JLabel("Senior Citizon");
				lblcitizon.setBounds(150,420,200,40);
				lblcitizon.setForeground(Color.WHITE);
				lblcitizon.setFont(f);			
				lblimg.add(lblcitizon);

				ctyes=new JRadioButton("Yes");
				ctyes.setFont(new Font("Arial",Font.BOLD,15));
				ctyes.setForeground(Color.BLACK);
				ctyes.setBounds(350,425,70,30);
				lblimg.add(ctyes);

				ctno=new JRadioButton("No");
				ctno.setFont(new Font("Arial",Font.BOLD,15));
				ctno.setBounds(445,425,55,30);
				ctno.setForeground(Color.BLACK);
				lblimg.add(ctno);

				ButtonGroup bg2=new ButtonGroup();
				bg2.add(ctyes);
				bg2.add(ctno);




				lblaccount=new JLabel("Account");
				lblaccount.setBounds(150,470,200,40);
				lblaccount.setForeground(Color.WHITE);
				lblaccount.setFont(f);			
				lblimg.add(lblaccount);

				accyes=new JRadioButton("Yes");
				accyes.setFont(new Font("Arial",Font.BOLD,15));
				accyes.setBounds(350,475,70,30);
				accyes.setForeground(Color.BLACK);
				lblimg.add(accyes);

				accno=new JRadioButton("No");
				accno.setFont(new Font("Arial",Font.BOLD,15));
				accno.setBounds(445,475,55,30);
				accno.setForeground(Color.BLACK);
				lblimg.add(accno);

				ButtonGroup bg3=new ButtonGroup();
				bg3.add(accyes);
				bg3.add(accno);


				
				next2=new JButton("Next");
				next2.setFont(new Font("Arial",Font.BOLD,15));
				next2.setBackground(Color.WHITE);
				next2.setForeground(Color.BLACK);
				next2.setBounds(400,540,100,30);
				next2.addActionListener(this);
				lblimg.add(next2);
		
		setSize(780,650);
		setLocation(550,90);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		if(ae.getSource()==next2)
		{
			//getData In Above Field
			
			String rel=(String)CBReligion.getSelectedItem();	//Method ReturnType-Object(String)
			String cat=(String)CBCategory.getSelectedItem();
			String income=(String)CBIncome.getSelectedItem();
			String edu=(String)CBEducation.getSelectedItem();
			String occ=(String)CBOccupation.getSelectedItem();
			String pan=tfpan.getText();
			String adhar=tfadhar.getText();
		
			String citizone=null;
			if(ctyes.isSelected())
			{
				citizone="yes";
			}
			else if(ctno.isSelected())
			{
				citizone="no";
			}
		
			String account=null;
			if(accyes.isSelected())
			{
				account="yes";
			}
			else if(accno.isSelected())
			{
				account="no";
			}
		
			//When The USer Click Next2 Button Print Data Into Database.
		
			try
			{
				if(tfpan.getText().equals("")||tfadhar.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Values In This Field");
				}
				else
				{
					ConnectionProject cp=new ConnectionProject();
					String query="insert into signuptwo values('"+formnum+"','"+rel+"','"+cat+"','"+income+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+citizone+"','"+account+"')";
					cp.stmt.executeUpdate(query);
					setVisible(false);
					new SignUpThree(formnum).setVisible(true);
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
		new SignUpTwo("");
	}

}
