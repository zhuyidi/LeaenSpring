package AdvancedAssembly.Scope;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by dela on 10/9/17.
 */

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {
}
