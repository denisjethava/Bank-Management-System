package Bank;
import java.sql.*;

public class ConnectionProject
{
	//Instance Variable.
	
	Connection con;
	Statement stmt;
	
	public ConnectionProject()
	{
		try
		{
				//Loading The Driver.
				Class.forName("com.mysql.cj.jdbc.Driver"); //First-Package : Driver-className  
				
				//Established The Connection With Database.
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","mysql");
				
				//createStatement = When You Are Write Query Show This Method.
				stmt=con.createStatement();	
		}
		catch(Exception e)
		{
			e.printStackTrace();  //Any Error Show Display.
		}
	}
}
