package blog.entity;

import java.util.Date;

/**
 * @author: wyf
 * @date: Created on 2019/3/20
 * @description:
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longtitude;

    public Spittle(String message,Date time)
    {
        this(message,time,null,null);
    }
    public Spittle(String message,Date time,Double longtitude,Double latitude)
    {
        this.id=null;
        this.message=message;
        this.time=time;
        this.latitude=latitude;
        this.longtitude=longtitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

}
