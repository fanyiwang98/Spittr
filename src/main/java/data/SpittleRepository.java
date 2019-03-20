package data;


import entity.Spittle;
import java.util.List;

/**
 * @author: wyf
 * @date: Created on 2019/3/20
 * @description:
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
}
