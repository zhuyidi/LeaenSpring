package Spittr.Dao;

import Spittr.Model.Spitter;
import org.springframework.stereotype.Component;

/**
 * Created by dela on 11/9/17.
 */
@Component
public class TestSpitterRepository implements SpitterRepository {
    public Spitter save(Spitter spitter) {
        //TODO
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return new Spitter("Jay", "zhou", "JayZhou", "zhoujielun");
    }
}
