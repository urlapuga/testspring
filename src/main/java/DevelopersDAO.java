import Model.Developer;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Андрей on 25.06.2017.
 */
public class DevelopersDAO implements DAO<Developer> {

    private ComboPooledDataSource dataSource;

    public boolean create(Developer developer) {
        return false;
    }

    public Developer read(int id) {
        try(Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM test");
            while (resultSet.next()) {
                Developer developer = new Developer(resultSet.getInt("id"));
                System.out.println(developer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

    public boolean update(Developer developer) {
        return false;
    }

    public boolean delete(Developer developer) {
        return false;
    }

    public void setDataSource(ComboPooledDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ComboPooledDataSource getDataSource() {
        return dataSource;
    }
}
