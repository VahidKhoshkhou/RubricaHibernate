package dao;

import hibernateUtil.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Rubrica;

public class RubricaDao {
	
	
	// 1- Create 
	
	public boolean creaRubrica(Rubrica r){
		boolean res=false;
		
		
		
		
		
Session session=HibernateUtil.openSession();
		
		Transaction tx=null;
		
		try{
		
		tx=session.getTransaction();
		
		         tx.begin();

		     session.persist(r); 
		         
		         
		     tx.commit(); 
		     res=true;
		}catch(Exception ex){
			
			tx.rollback();
			
			
		}finally{
			session.close();
		}
		
	
		
		return res;
		
	}
	
//     public boolean creaRubrica(String  nome,){
//		
//	}

}
