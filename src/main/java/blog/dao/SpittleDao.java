package blog.dao;

import blog.entity.Spittle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @author: wyf
 * @date: Created on 2019/3/22
 * @description:
 */
@Repository
public class SpittleDao {
    public void add(Spittle spittle) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        s.save(spittle);

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
