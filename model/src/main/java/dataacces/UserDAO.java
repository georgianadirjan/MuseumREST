package dataacces;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import database.SessionHandler;
import model.User;

public class UserDAO {

	public User getUserById(long id){
		SessionFactory factory = SessionHandler.getSessionFactory();
		Session session = factory.openSession();
		Query<User> query = session.createQuery("from user where id=" + id);
		List<User> result = query.getResultList();
		System.out.println(result.get(0).getUserName());
		session.close();
		return result.size() > 0 ? result.get(0) : null;
		
	}
	
}
