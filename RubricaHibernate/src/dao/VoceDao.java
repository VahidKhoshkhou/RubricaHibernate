package dao;

import hibernateUtil.HibernateUtil;
import model.Rubrica;
import model.Voce;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VoceDao {

	
	// 1- Create 
	
		public boolean creaVoce(Voce v){
			boolean res=false;
			
			
			
			
			
	Session session=HibernateUtil.openSession();
			
			Transaction tx=null;
			
			try{
			
			tx=session.getTransaction();
			
			         tx.begin();

			     session.persist(v); 
			         
			         
			     tx.commit(); 
			     res=true;
			}catch(Exception ex){
				
				tx.rollback();
				
				
			}finally{
				session.close();
			}
			
		
			
			return res;
			
		}
}
