package Spittr.Model;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by dela on 11/5/17.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude; //纬度
    private Double longitude; //经度

    public Spittle(String message, Date time){
        //在一个构造方法中调用另外一个构造方法用this.
        this(null, message, time, null, null);
    }

    public Spittle(Long id, String message, Date time, Double longitude, Double latitude){
        this.id = id;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    //EqualsBuilder.reflectionEquals和HashCodeBuilder.reflectionHashCode是用来辅助实现Object.equals()和Object.hashCode()方法的.
    //如果hashCode()和equals()取决于该class所有的filed时, 需要使用反射机制来生成一个hashCode/equals
    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    //在Java应用程序运行期间, 在对同一对象多次调用hashCode方法时, 必须一致的返回相同的整数,
    //前提是将对象进行hashCode比较时所用的信息没有被修改.
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
