package Spittr.data;

import Spittr.Model.Spitter;

/**
 * Created by dela on 11/9/17.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
