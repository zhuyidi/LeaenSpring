package AdvancedAssembly.ProfileBean;

import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 9/26/17.
 */

@Configuration
public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource(){
//        return new EmbeddedDatabaseBuilder()
//                .addScript("classpath:schema.sql")
//                .addScript("classpath:test-data.sql").build();
//    }

//    @Bean
//    public DataSource dataSource(){
//        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
//        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
//        jndiObjectFactoryBean.setResourceRef(true);
//        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
//
//        return (DataSource)jndiObjectFactoryBean;
//    }

//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//    }
}
