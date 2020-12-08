package com.meiit.weblk.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.meiit.webalk.eclipselink.entity.Employee;

public class DeleteEmployee 
{
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory( "VM_JPA" );
		EntityManager entitymanager = emfactory.
				createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		Employee employee=entitymanager.
				find( Employee.class, 0001 );
		entitymanager.remove( employee );
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
	}
}
