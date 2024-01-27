package database;

import java.sql.*;

public class Database
{
    protected static Connection dbConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:db\\UserDB.db");
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }

        return connection;

    }

    public static boolean checkLoginPassword(String login, String password){
        Connection con = dbConnection();
        String query = "SELECT * FROM AuthorizedUsers WHERE iin_phoneNumber = ? and password = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return false;
    }
}