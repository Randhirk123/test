package dao;

import java.util.List;

import model.Student;

public interface StudentDao 
{
	public int save(Student st);
	public boolean update(Student st);
	public boolean delete(Student st);
	public Student findByPk(int pk);
	public List<Student> findAllUsingHql();
	public List<Student> findAllUsingCriteria();
	
}
