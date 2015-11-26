package main;

import java.sql.Connection;
import java.sql.DriverManager;


public class db2Connectivity {
	Connection connect = null;
	db2Connectivity(){
		
	}
	public static Connection dbConnector()
	{
	try{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection connect = DriverManager.getConnection("jdbc:db2://localhost:50000/mashup","HP","saloni");
		//jdbc:db2:hostname:port Number/databaseName
		return connect;
	}
	catch(Exception e){
		return null;
	}
}
}