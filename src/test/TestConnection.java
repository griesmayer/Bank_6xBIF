package test;

import java.sql.Connection;
import java.sql.SQLException;

import connection.OracleConnection;
import domain.BankAccountException;

public class TestConnection
{
	public static void main(String[] args)
	{
		try
		{
			OracleConnection oracleConnection = new OracleConnection();
			oracleConnection.open();
			Connection connection = oracleConnection.getConnection();
			System.out.println(connection.getMetaData().getDatabaseMajorVersion());
			oracleConnection.close();
		}
		catch (BankAccountException e)
		{
			System.out.println(e.getMessage());
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
