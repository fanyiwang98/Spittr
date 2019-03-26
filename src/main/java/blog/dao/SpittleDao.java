package blog.dao;

import blog.entity.Spittle;
import blog.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

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

        User user = new User();
        user.setName("test");
        s.save(user);
        spittle.setUser(user);
        s.save(spittle);

        s.getTransaction().commit();
        s.close();
        sf.close();
    }

    public Spittle get(Long id) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        Spittle spittle = (Spittle) s.get(Spittle.class, id);

        s.getTransaction().commit();
        s.close();
        sf.close();
        return spittle;
    }

    public void delete(Long id) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        Spittle spittle = (Spittle) s.get(Spittle.class, id);
        s.delete(spittle);

        s.getTransaction().commit();
        s.close();
        sf.close();
    }

    public List<Spittle> getHQL(String message) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        Query q = s.createQuery("from Spittle s where s.message like ?");
        q.setString(0, "%" + message + "%");
        List<Spittle> spittles = q.list();

        s.getTransaction().commit();
        s.close();
        sf.close();
        return spittles;
    }

    public List<Spittle> getCriteria(String message) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        Criteria c = s.createCriteria(Spittle.class);
        c.add(Restrictions.like("message", "%" + message + "%"));
        List<Spittle> spittles = c.list();

        s.getTransaction().commit();
        s.close();
        sf.close();
        return spittles;
    }

    public List<Spittle> getSQL(String message) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        String sql = "select * from spittle where message like '%" + message + "%'";
        Query q = s.createQuery(sql);
        List<Spittle> spittles = q.list();

        s.getTransaction().commit();
        s.close();
        sf.close();
        return spittles;
    }

    public Set<Spittle> getByUserId(Long userId) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        String sql = "select id,message,time,longtitude,latitude from spittle where user_id = " + userId;
        Query q = s.createQuery(sql);
        List<Spittle> spittles = q.list();

        s.getTransaction().commit();
        s.close();
        sf.close();
        return (Set<Spittle>) spittles;
    }
}
