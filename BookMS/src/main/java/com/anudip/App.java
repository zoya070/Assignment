package com.anudip;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static SessionFactory createConfiguration() {
		Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory ss = conf.buildSessionFactory();
		return ss;
	}
	public static void createBook(Session ss, Transaction t) {

		Book b1 = new Book(101, "Whereabouts", 700,"Jhumpa Lahiri","Central Library");
		Book b2 = new Book(102, "Neighbour", 760, "ThV","Library of Congress");
		Book b3 = new Book(103, "The Christmas Pig", 800, "JK Rowling","National Library");
		Book b4 = new Book(104, "True, Orwell", 690, "George Orwell","National Library");
		Book b5 = new Book(105, "War and Peace", 910, "Leo Tolstoy","Central Library");
		ss.save(b1);
		ss.save(b2);
		ss.save(b3);
		ss.save(b4);
		ss.save(b5);
		t.commit();
	}
	public static void getAllBook(Session ss, Transaction t) {
		Query query = ss.createQuery("from Book");

		List<Book> books = query.list();
		for (Book book : books) {
			System.out.println(book.getBookId()+book.getBookName()+book.getBookPrice()+book.getAuthorName()+book.getLibraryName());
		}
	}
	public static void updateBook(Session ss, Transaction t) {
		t.begin();
		Book b = ss.find(Book.class, 2);
		b.setBookName("William Shakespeare");
		ss.save(b);
		t.commit();

	}
	public static void deleteBook(Session ss, Transaction t) {
		t.begin();
		Book b = ss.find(Book.class, 2);

		ss.delete(b);
		t.commit();

	}
		public static void main(String[] args)

		{
			SessionFactory sessionfactory = createConfiguration();
			Session session = sessionfactory.openSession();
			Transaction t = session.beginTransaction();
			createBook(session, t);
			updateBook(session,t);
			deleteBook(session,t);
			getAllBook(session, t);
			System.out.println("Done...");
		}
	}

	
