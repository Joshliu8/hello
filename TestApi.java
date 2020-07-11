import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ee");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        try {
            JdbcTemplate jdbcTemplate = new JdbcTemplate();
            jdbcTemplate.setDataSource(dataSource);

            jdbcTemplate.update("insert into t_user(username, password) values(?,?);", "tom", "998");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}