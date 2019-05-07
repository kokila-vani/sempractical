package Bookdao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import BookModel.Bookmodel;
@Repository
public class Bookdaoimpl implements bookinterdao {

	@Autowired
	SessionFactory factory;

	@Override
	public void createStudent(Bookmodel s1) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(s1);
	}
	

	@Override
	public List<Bookmodel> getStudents() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Sandhiya");
		List<Bookmodel> students = query.list();
		return students;
	}

	@Override
	public Bookmodel getStudent(String id) {
		Session session = factory.getCurrentSession();
		Bookmodel s1 =(Bookmodel) session.get(Bookmodel.class,Integer.parseInt(id));
		return s1;
	}

	@Override
	public void deleteStudent(Bookmodel s1) {
		Session session = factory.getCurrentSession();
		session.delete(s1);
	}

	
	

}
