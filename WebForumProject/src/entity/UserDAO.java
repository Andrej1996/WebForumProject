package entity;

import database.DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static String TABLE = "users";

    /**
     * Method who find user by id
     */
    public User findById(int id){

        User ret = null;

        String sqlStatement = String.format("SELECT * FROM %s WHERE id = ? ", TABLE);
        DBManager db = new DBManager();

        try (PreparedStatement statement = db.getConnection().prepareStatement(sqlStatement)){
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {

                if (rs.next()) {
                    ret = new User(rs.getString("USER"),rs.getString("username"),rs.getString("password"),rs.getString("email"),
                            rs.getString("gender"),rs.getInt("age"),rs.getString("currentStatus"),rs.getString("registeredStatus"));
                }
            }
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return ret;

    }
}
