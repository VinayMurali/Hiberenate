package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import sakha.HibernateDemo;

public class HibMainCls {

	public static void main(String[] args) {

		HibernateDemo hd = new HibernateDemo();
		
	

		Configuration cfg = new Configuration();
		cfg.configure("Resources/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		hd.setName("RAMAnas");
		hd.setCollege("KSITcl");
		hd.setId(1251);
		session.persist(hd);
		t.commit();
		session.close();
		System.out.println("Successful ");

	}
}
