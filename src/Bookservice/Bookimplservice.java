package Bookservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import BookModel.Bookmodel;
import Bookdao.bookinterdao;

public class Bookimplservice implements Bookinterservice {
	@Autowired
	bookinterdao dao;
	@Override
	@Transactional
	public void createStudent(Bookmodel s1) {
		// TODO Auto-generated method stub
		dao.createStudent(s1);
	}
	@Override
	@Transactional
	public List<Bookmodel> getStudents() {
		return dao.getStudents();
	}

	@Override
	@Transactional
	public Bookmodel getStudent(String id) {
		return dao.getStudent(id);
	}

	@Override
	@Transactional
	public void deleteUser(Bookmodel s1) {
		dao.deleteStudent(s1);
	}

}

