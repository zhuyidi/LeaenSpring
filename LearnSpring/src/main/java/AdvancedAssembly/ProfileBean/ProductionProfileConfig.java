package AdvancedAssembly.ProfileBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by dela on 9/29/17.
 */

@Configuration
@Profile("prod")
public class ProductionProfileConfig {
//    @Bean
//    public DataSource dataSource(){
//        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
//        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
//        jndiObjectFactoryBean.setResourceRef(true);
//        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
//
//        return (DataSource)jndiObjectFactoryBean;
//    }
}
