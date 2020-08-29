package com.databaseautomation;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class StartTransactions {
	
	public static void main(String[] args) {
		
		
		EmployeeDetails employeeDetails=new EmployeeDetails();
		
		
		Configuration configuration=new Configuration().configure().addAnnotatedClass(EmployeeDetails.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory=configuration.buildSessionFactory(reg);
        Session session=sessionFactory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        
       
        SQLQuery query=session.createSQLQuery("select * from employeedetails");
        query.addEntity(EmployeeDetails.class);
        
        
        
        
        List<EmployeeDetails> employees=query.list();
       
        for (EmployeeDetails employee : employees) {
        	
        	System.out.println(employee.getAge());
        	System.out.println(employee.getName());
        	System.out.println(employee.getPlace());
        	System.out.println(employee.getSalary());
		}
        
        
        
        System.out.println(employees);   
        //session.flush();
        session.close();
        tx.commit();
		
		
	}
	

}
