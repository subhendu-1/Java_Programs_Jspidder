package mavensample;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demojdbc {
//	PostGres run on spacific location is called port Number which will be run on this port

	private static String url = "jdbc:postgresql:"; 
	private static String user = "school";
	private static String password = "123";// data should be confidential that's why we create as privet and static because DB name will not changebale
	
//	we can pass the user name and password in url using dalimetier 
	
	
	
	
	public static void main(String[] args) {
		// 1.Load & Driver Software --------------------------------> 
//		explictyly their is no need to check every thime in pom.xml file   org.postresql->Driver.class->Past
		// Inbild class "Class" has static forName method where we pass  "fully qulified path of driver software "we pass
		try {
			Class.forName("org.postgresql.Driver"); 
			System.out.println("Yes driver loaded");
			
//			How to coross check it is  is driver software dependenc is add or not
//			Driver.after hite controle sapce
			
			
			//2.Establishing Connection ---------------------------->
//			How to establish connection: 
			//Process: DriverManager a helper class under java.sql package  inside this there is a static method getConnection() mehtod
			//DriverManger.getConnection(url,user,password);  if url,usr,password is wrong we get SQLExcption
			// if all are right  This DriverManger  will return Connection Object ....... Connection is a inbuilt Interface
			// We can not create Connection that's why Connection has inplementation in one Anonymous sub class CreateStament() method implemantaion 
			//when upcasting and Overriding is done we get the implemetaion class method 
			
			
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
//			3.Create Statement
			
//			Statement Interface which is present java.sql package their some inbuilt method execute() 
			
//			Statement stm = (Statement) con.createStatement();
			java.sql.Statement stm = con.createStatement();
			
			
//			4.Excute Qureries
//			execute method will return boolean a value
			stm.execute("insert into student values(101,'Girish',19)");  //we pass the name between '' becasue in our table datatype is character verifing
			
			
//			5.Close Connection
//			close() method will present in Connection method interanly grabage collecter will destroyed the connection between java program and respectiver database
			con.close();
			
		    } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
//			Check driver softwar load or not check 
			System.out.println("No driver not found");
			
		    } catch (SQLException e) {
			
			e.printStackTrace();
		    }
	    }
	

}
