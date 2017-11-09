package Test;

import Spittr.Model.Spitter;

/**
 * Created by dela on 11/9/17.
 */
public class test {
    public static void main(String[] args){
        Spitter spitter = new Spitter();
        Spitter spitter1 = new Spitter();

        System.out.println(spitter);
        System.out.println(spitter1);
        System.out.println(spitter.equals(spitter1));
        spitter.hashCode();
    }
}
