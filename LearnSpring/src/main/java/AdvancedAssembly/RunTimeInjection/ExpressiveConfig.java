package AdvancedAssembly.RunTimeInjection;

import AssemblingBean.SoundSystem_Java.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by dela on 10/10/17.
 */

@Configuration
@PropertySource("classpath:/AdvancedAssembly/RunTimeInjection/app.properties") //声明属性源
public class ExpressiveConfig {
    @Autowired
    Environment environment;

//    @Bean
//    public CompactDisc jay(){
//        return new Jay(
//                environment.getProperty("jay.title"),
//                environment.getProperty("jay.artist")
//        );  //检索属性值
//    }

    @Bean
    public CompactDisc jay(){
        return new Jay(
                environment.getProperty("jay.title", "周杰伦的专辑"),
                environment.getProperty("jay.artist", "周杰伦")
        );
    }
}