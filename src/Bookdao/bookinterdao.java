package Bookdao;

import java.util.List;

import BookModel.Bookmodel;

public interface bookinterdao {

	void createStudent(Bookmodel s1);

	List<Bookmodel> getStudents();

	Bookmodel getStudent(String id);

	void deleteStudent(Bookmodel s1);
	
}
