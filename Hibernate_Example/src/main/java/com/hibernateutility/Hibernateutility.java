package com.hibernateutility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.entity.Movie;

public class Hibernateutility {

	
	public static SessionFactory buildSessionFactory(){
	Configuration conf=new Configuration().configure();
	
	Class<Movie> movieType = Movie.class;
	conf.addAnnotatedClass(movieType);
	
	SessionFactory factory =conf.buildSessionFactory();
	
	return factory;
	
	
	
	}
	
	
	
}
