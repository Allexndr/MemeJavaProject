package sample;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSql {

    public static void writeToDatabase(String userName, String userPassword, String userCountry, String userLogin, String userSurname) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "cfif2004";

        String name = userName;
        String surname = userSurname;
        String pass = userPassword;
        String login = userLogin;
        String country = userCountry;
        // query
        String query = "INSERT INTO users(name,surname,login, password,country) VALUES(?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, userName);
            pst.setString(2, userSurname);
            pst.setString(3, userLogin);
            pst.setString(4, userPassword);
            pst.setString(5, userCountry);
            pst.executeUpdate();
            System.out.println("Successfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }


}
