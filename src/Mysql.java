import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Mysql 
{
	 ResultSet myre;
	 Statement  mystate;
	 Connection mycon;
	Mysql()
	{
		 
		 try
		  {      
		  
		
	      Class.forName("com.mysql.jdbc.Driver");
	      mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/ITMS","root","lnmiit");
		  mystate=mycon.createStatement();
		  myre=mystate.executeQuery("select * from vechile");	
		  }
				   
			catch(Exception ex)
				  {
					ex.printStackTrace();
				  } 
	}
	public String data(int i)
	{
	
	if(i==0)
	{
	  try {
		if(!myre.isLast())
		  {
		   try {
			myre.next();
			return (myre.getString("frequency_1"));
			 
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		  }
		else
		{
			myre.first();
			return (myre.getString("frequency_1"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	else if(i==1||i==3)
	{
		try {
			return (myre.getString("frquency_"+(i+1)));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	else
	{
		try {
			return (myre.getString("frequency_3"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return null;
	
   }

}