package AdvancedAssembly.Scope;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by dela on 10/9/17.
 */

@Configuration
public class NotepadConfig {
    @Bean
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad(){
        return new Notepad();
    }
}
