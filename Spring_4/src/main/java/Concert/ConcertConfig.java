package Concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by dela on 10/18/17.
 */

@Configuration
@EnableAspectJAutoProxy //启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {

    //声明Audience Bean
    @Bean
    public Audience audience(){
        return new Audience();
    }
}