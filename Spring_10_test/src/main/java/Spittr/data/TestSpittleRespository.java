package Spittr.data;

import Spittr.Model.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dela on 11/7/17.
 */
@Component
public class TestSpittleRespository implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        Spittle test = new Spittle(new Long(1), "one", new Date(), new Double(0), new Double(0));
        List<Spittle> spittles = new ArrayList<Spittle>();
        spittles.add(test);

        return spittles;
    }

    public Spittle findOne(Long spittleId) {
        return new Spittle(new Long(2), "two", new Date(), 0.0, 0.0);
    }
}
