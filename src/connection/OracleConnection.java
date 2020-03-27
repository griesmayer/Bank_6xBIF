package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.BankAccountException;

public class OracleConnection
{
	private Connection connection;
	
	public OracleConnection() throws BankAccountException
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch (ClassNotFoundException e)
		{
			throw new BankAccountException("Couldn't find database driver!");
		}
	}
	
	public void open() throws BankAccountException
	{
		try
		{
			connection = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL", "DEMO", "oracle");
		}
		catch (SQLException e)
		{
			throw new BankAccountException("Couldn't open database connection!");
		}
	}
	
	public void close() throws BankAccountException
	{
		try
		{
			connection.close();
		}
		catch (SQLException e)
		{
			throw new BankAccountException("Couldn't close database connection!");
		}
	}
	
	public Connection getConnection()
	{
		return connection;
	}
}







