package bussiness;

import java.util.List;

import model.Student;

public interface StudentBo
{
	public int createStudent(Student st);
	public boolean updateStudent(Student st);
	public boolean deleteStudent(Student st);
	public Student findById(int id);
	public List<Student> selctAllHql();
	public List<Student> selectAllCriteria();
}
