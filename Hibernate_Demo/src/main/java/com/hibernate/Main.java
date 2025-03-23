package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main
{
    public static void main(String[] args)
    {
//        Inserting object into database;
//        Updating the data from database
        Alien object1 = new Alien();
        object1.setAro(102);
        object1.setAname("User_B");
        object1.setAcity("Banglore");
        object1.setAmarks(101);

//        Updatation Method: 2

//        Alien object2 = new Alien();
//        object2.setAro(104);
//        object2.setAname("User_D");
//        object2.setAcity("Maharashtra");
//        object2.setAmarks(200);




//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.hibernate.Alien.class);
//        config.configure("hibernate.cfg.xml");

        Configuration config = new Configuration().addAnnotatedClass(com.hibernate.Alien.class).configure();

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

//        Transaction is needed when we save, update or delete
        Transaction transaction = session.beginTransaction();

//        Pushing object into database;
//        session.persist(object1);

//        Fetch the data from database

//        Method: 1
//        Alien object = session.find(Alien.class,101);

//        Method: 1
//        Alien object = session.byId(Alien.class).getReference(101);       // lazy fetching
//        transaction.commit();
//        Alien object = session.find(Alien.class, 102);               // eager fetching
//        System.out.println(object);


//        Update the data
//        If object is there -> update the object else create new object
//        session.merge(object2);


//        Delete the particular data from the database

//        Alien objectDelete = session.find(Alien.class, 104);
//        session.remove(objectDelete);   // remove method require object -> so we fetch the data inside object then perform the delete operation

        session.persist(object1);

        transaction.commit();

        session.close();
        factory.close();
    }
}
