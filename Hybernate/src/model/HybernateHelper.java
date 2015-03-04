package model;

import java.util.HashSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.SessionFactoryUtil;

public class HybernateHelper {
	private SessionFactory sesion;

	 public HybernateHelper(){
	 sesion = SessionFactoryUtil.getSessionFactory();
	 }
	 public void addQuestion(int id, String text, String category){
	 Session session = sesion.openSession();
	 Transaction tx = session.beginTransaction();
	 Question question = new Question(id,text,category,
	new HashSet<Answer>(0));
	 session.save(question);
	 tx.commit();
	 session.close();
}
	 public void  saveQuestion(Question question){
			Session session = sesion.openSession();
			Transaction tx = session.beginTransaction();
			session.save(question);	
			tx.commit();
			session.close();
			
		}
		public Question getLastQuestion(){
			Session session = sesion.openSession();
			
			Query query = session.createQuery("from Question order by idQuestion DESC");
			query.setMaxResults(1);
			Question last = (Question) query.uniqueResult();
			session.close();

			return last;
			
		}
	
}
