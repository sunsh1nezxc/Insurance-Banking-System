package database;

import java.sql.*;

public class Database
{
    protected static Connection dbConnection()
    {
        String os = System.getProperty("os.name").toLowerCase();
        Connection connection = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url;
            url = os.contains("win") ? "jdbc:sqlite:db\\UserDB.db" : "jdbc:sqlite:db//UserDB.db";
            connection = DriverManager.getConnection(url);
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

    public static void newUserRegister(String id, String password, String phoneNumber)
    {
        Connection con = dbConnection();
        String query = "INSERT INTO AuthorizedUsers (id, password, phoneNumber) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, phoneNumber);
            preparedStatement.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void changeUserPassword(String login){
        // TODO add Password Change
    }



}