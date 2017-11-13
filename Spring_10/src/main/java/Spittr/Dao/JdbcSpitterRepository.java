package Spittr.Dao;

import Spittr.Model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dela on 11/13/17.
 */

@Repository
public class JdbcSpitterRepository implements SpitterRepository {
    private JdbcOperations jdbcOperations;
    private final static String INSERT_SPITTER = "INSERT INTO spitter (username, password, " +
            "firstname, lastname) VALUES (?, ?, ?, ?)";
    private final static String QUERY_SPITTER_BY_USERNAME = "SELECT * FROM spitter " +
            "WHERE username = ?";

    @Autowired
    public JdbcSpitterRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public Spitter save(Spitter spitter) {
        jdbcOperations.update(INSERT_SPITTER, spitter.getUsername(), spitter.getPassword(),
                spitter.getFirstName(), spitter.getLastName(), spitter.getEmail());

        return spitter;
    }

    public Spitter findByUsername(String username) {
        return jdbcOperations.queryForObject(QUERY_SPITTER_BY_USERNAME,
                new SpitterRowMapper(), username);
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
