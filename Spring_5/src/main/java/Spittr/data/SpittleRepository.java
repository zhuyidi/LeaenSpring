package Spittr.data;

import Spittr.Spittle;

import java.util.List;

/**
 * Created by dela on 11/5/17.
 */

//这个接口是用来数据访问的Repository.
public interface SpittleRepository {
    //这是一个用来获取Spittle列表的Repository
    List<Spittle> findSpittles(long max, int count);
}
