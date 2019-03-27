package blog.dao;

import blog.entity.Spittle;
import blog.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author: wyf
 * @date: Created on 2019/3/26
 * @description:
 */
@Repository
public class UserDao {
    public User list(Long id) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        User user = (User) s.get(User.class, id);
        Set<Spittle> spittleSet = user.getSpittleSet();
        System.out.println(spittleSet);
        System.out.println(user);
        s.getTransaction().commit();
        s.close();
        sf.close();
        return user;
    }
}
