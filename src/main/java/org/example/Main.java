package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        SessionFactoryUtils utils = new SessionFactoryUtils();
        utils.init();
        try {
            UserDao userDao = new UserDaoImpl(utils);
            User user = new User("max", 111);
            userDao.save(user);

            userDao.update(4L, "maxwell");
            System.out.println(userDao.findAll());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            utils.shutdown();
        }
    }
}
