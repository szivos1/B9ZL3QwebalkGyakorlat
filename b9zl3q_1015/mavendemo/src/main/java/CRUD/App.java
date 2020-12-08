package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;

import CRUD.Select;
import storedProcedure.InResultSet;

public class App
{

	public static void main(String[] args)
	{
		String connectionString = "jdbc:mysql://localhost:3306/cats?serverTimezone=UTC";
		String username = "b9zl3q";
		String password = "password";

		Connection connection = Connect.connect(connectionString, username, password);
		
		ResultSet rs = Select.selectCats(connection, 1);
		Select.print(rs);
		
		InResultSet.selectBasedOnOwner(connection, "Piros Ferrnc");
		
		Connect.disconnect(connection);
	}

}
