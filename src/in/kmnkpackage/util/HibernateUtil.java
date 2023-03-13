package in.kmnkpackage.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.kmnkpackage.dto.BookData;
import in.kmnkpackage.dto.CustomerDetails;
import in.kmnkpackage.dto.OrderDetails;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	private static Session session = null;

	private HibernateUtil() {

	}

	static {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(BookData.class)
					.addAnnotatedClass(OrderDetails.class).addAnnotatedClass(CustomerDetails.class)
					.buildSessionFactory();
		} catch (HibernateException ce) {
			ce.printStackTrace();
		}
	}

	public static Session getSession() {
		if (sessionFactory != null)
			session = sessionFactory.openSession();

		System.out.println("connected db successfully");

		return session;
	}

	public void closeSession() {
		if (session != null)
			session.close();
	}

	public void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}
}
