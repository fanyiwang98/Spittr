package blog.dao;

import blog.entity.Spittle;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: wyf
 * @date: Created on 2019/3/22
 * @description:
 */
@Repository
public class SpittleDao {
    private String sqlInsert = "insert into spittle (id,message,longtitude,latitude) values (?,?,?,?)";
    private DriverManagerDataSource dateSource;

    public void addSpittle(Spittle spittle) {
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            if (spittle != null) {
                connection = dateSource.getConnection();
                stmt = connection.prepareStatement(sqlInsert);
                stmt.setLong(1, spittle.getId());
                stmt.setString(2, spittle.getMessage());
                stmt.setDouble(3, spittle.getLongtitude());
                stmt.setDouble(4, spittle.getLatitude());
                stmt.execute();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
