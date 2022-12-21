package example.entity.main;

import java.lang.module.Configuration;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateutility.Hibernateutility;

import example.entity.Movie;

public class MovieExample {

	public static void main(String[] args) {
		//add();
		
	}
	
	public static void add() {
		SessionFactory factory = Hibernateutility.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Movie m1 = new Movie("Singham2","Action/ Drama",1.57,2010);
		
		session.save(m1);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Created");
	}
	
	public static void hqlUsingCriteria() {
		SessionFactory factory = Hibernateutility.buildSessionFactory();
		Session session = factory.openSession();
		
	}

}
