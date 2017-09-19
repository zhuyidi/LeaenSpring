package com.SoundSystem_Java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 9/12/17.
 */

@Configuration
public class JavaConfigTest {
    @Bean
    public Jay jay1(){
        return new Jay();
    }
}
