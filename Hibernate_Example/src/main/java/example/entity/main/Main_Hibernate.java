package example.entity.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import example.entity.Course;

public class Main_Hibernate {

	
	private static void create() {
		
		Configuration conf = new Configuration();
		conf = conf.configure();
	
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Course crs = new Course("DB", "DataBase", 2, 10000);
		session.save(crs);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Table created successfully");
		
	}
public static void main (String[] args) {
		
		create();

	}

}
