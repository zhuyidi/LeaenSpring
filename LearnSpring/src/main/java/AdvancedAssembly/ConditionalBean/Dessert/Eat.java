package AdvancedAssembly.ConditionalBean.Dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dela on 10/9/17.
 */

@Component
public class Eat {
    private Dessert dessert;

    @Autowired
//    @Qualifier("cold")
    @Cold
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }
}
