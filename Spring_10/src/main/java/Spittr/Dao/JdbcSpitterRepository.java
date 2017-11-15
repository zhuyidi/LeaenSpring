package Spittr.Dao;

import Spittr.Model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by dela on 11/13/17.
 */

@Repository
public class JdbcSpitterRepository implements SpitterRepository {
    private JdbcOperations jdbcOperations;
    private final static String INSERT_SPITTER = "INSERT INTO Spitter (username, password, firstname, lastname, email) VALUES (?, ?, ?, ?, ?)";
    private final static String QUERY_SPITTER_BY_USERNAME = "SELECT * FROM Spitter " +
            "WHERE username = ?";
    private final static String QUERY_SPITTER_BY_ID = "SELECT * FROM Spitter " +
            "WHERE id = ?";


    @Autowired
    public JdbcSpitterRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public Spitter save(Spitter spitter) {
        jdbcOperations.update(INSERT_SPITTER, spitter.getUsername(), spitter.getPassword(),
                spitter.getFirstName(), spitter.getLastName(), spitter.getEmail());

        return spitter;
    }

    public List<Spitter> findByUsername(String username) {
        System.out.println("在findByUsername里面!");
        return jdbcOperations.query(QUERY_SPITTER_BY_USERNAME,
                new SpitterRowMapper(), username);
    }

    public Spitter findById(Long id) {
        return jdbcOperations.queryForObject(QUERY_SPITTER_BY_ID, new SpitterRowMapper(), id);
    }

    private final static class SpitterRowMapper implements RowMapper<Spitter> {
        public Spitter mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new Spitter(
                    resultSet.getLong("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("email")
            );
        }
    }
}
