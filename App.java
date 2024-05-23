package com.image;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException {
    System.out.println( "Work is Runing On" );
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
     
    Employee em=new Employee();
    em.setName("Sneha");
    em.setCity("Raipur");
    em.setOpen(true);
    em.setX(1);
    
    FileInputStream is=new FileInputStream("C:\\Users\\HP\\AppData\\Local\\Temp\\6936f82e-555a-4686-a96b-18c714d377ca_ImageUploadInHibernare.zip.7ca\\ImageUploadInHibernare\\src\\main\\java\\dhoni.jpeg");
    byte[] img=new byte[is.available()]  ;
    is.read();
    em.setImage(img);
    Session session=factory.openSession();
    Transaction tx=session.beginTransaction();
    
   
    session.save(em);
    tx.commit();
    session.close();
    System.out.println("image uploaded");
    
}
}