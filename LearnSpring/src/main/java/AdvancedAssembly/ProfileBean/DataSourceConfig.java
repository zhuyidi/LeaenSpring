package AdvancedAssembly.ProfileBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

/**
 * Created by dela on 9/26/17.
 */

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql").build();
    }
}
