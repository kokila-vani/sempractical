package Bookservice;

import java.util.List;

import BookModel.Bookmodel;

public interface Bookinterservice {

	void createStudent(Bookmodel s1);

	List<Bookmodel> getStudents();

	Bookmodel getStudent(String id);

	void deleteUser(Bookmodel s1);

}
