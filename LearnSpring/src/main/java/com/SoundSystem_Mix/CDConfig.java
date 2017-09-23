package com.SoundSystem_Mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 9/20/17.
 */

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new Jay();
    }
}
