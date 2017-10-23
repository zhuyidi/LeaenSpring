package Concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by dela on 10/23/17.
 */

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value="Concert.Performance+",
                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
