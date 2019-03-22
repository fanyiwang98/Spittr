package blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author: wyf
 * @date: Created on 2019/3/20
 * @description:
 */
public class Spittle {
    private Long id;
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date time;
    private Double latitude;
    private Double longtitude;

    public Spittle() {
    }

    ;

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Spittle(String message, Date time, Double longtitude, Double latitude, Long id)
    {
        this.id = id;
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
