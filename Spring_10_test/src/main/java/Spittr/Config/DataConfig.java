package Spittr.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by dela on 11/6/17.
 */

@Configuration
@ImportResource("classpath:DataSourceConfig.xml")
public class DataConfig {

    //在jdbcTemplate Bean里面所需要的dataSource Bean已经在DataSourceConfig.xml中已经声明过了.
    //jdbcTemplate Bean用来声明JDBC模板.
    @Bean
    public JdbcOperations jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
