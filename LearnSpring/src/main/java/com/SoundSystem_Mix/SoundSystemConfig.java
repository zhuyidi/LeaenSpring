package com.SoundSystem_Mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by dela on 9/20/17.
 */

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:CDMix.xml")
public class SoundSystemConfig {
}
