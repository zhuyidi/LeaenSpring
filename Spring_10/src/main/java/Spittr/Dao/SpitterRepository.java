package Spittr.Dao;

import Spittr.Model.Spitter;

import java.util.List;

/**
 * Created by dela on 11/9/17.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    List<Spitter> findByUsername(String username);
    Spitter findById(Long id);
}
