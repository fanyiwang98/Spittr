package blog.config;

import blog.entity.Spittle;
import lombok.Data;

/**
 * @author: wyf
 * @date: Created on 2019/3/22
 * @description:
 */
@Data
public class Result {
    private int statusCode;
    private String description;
    private Object data;

    public Result() {
        statusCode = 0;
    }

    public static Result Success() {
        Result result = new Result();
        result.setStatusCode(200);
        Spittle spittle = new Spittle();
        spittle.setId(1l);
        //spittle.setLatitude(100.0);
        spittle.setMessage("test");
        result.setData(spittle);
        System.out.println(result);
        return result;
    }

}
