package AdvancedAssembly.ProfileBean;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by dela on 10/9/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {PersistenceTestConfig.class})
@ActiveProfiles("dev")
public class ActiveProfile {
    //...
}
