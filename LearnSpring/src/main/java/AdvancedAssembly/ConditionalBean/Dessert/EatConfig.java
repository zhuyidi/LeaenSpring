package AdvancedAssembly.ConditionalBean.Dessert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by dela on 10/9/17.
 */

@Configuration
public class EatConfig {
    @Bean
    @Primary
    public Dessert iceCream(){
        return new IceCream();
    }
}
