package com.meiit.weblk.eclipselink.service;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.meiit.webalk.eclipselink.entity.Employee;

public class UpdateEmployee 
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
		System.out.println( employee );
		employee.setSalary( 99999 );
		entitymanager.getTransaction( ).commit( );
		System.out.println( employee );
		entitymanager.close();
		emfactory.close();
	}
}