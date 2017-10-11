package AdvancedAssembly.RunTimeInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by dela on 10/11/17.
 */

@Configuration
public class PropertySourcesPlaceholderConfig {
    @Bean
    static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
