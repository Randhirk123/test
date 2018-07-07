package bussiness;

import java.util.List;

import dao.StudentDao;
import model.Student;

public class StudentBoImp implements StudentBo
{
	private StudentDao sdao;
	public void setSdao(StudentDao dao)
	{
		this.sdao = dao;
	}
	public int createStudent(Student st) 
	{
		return sdao.save(st);
	}

	
	public boolean updateStudent(Student st)
	{
		return sdao.update(st);
	}

	
	public boolean deleteStudent(Student st) 
	{
		return sdao.delete(st);
	}

	
	public Student findById(int id)
	{
		
		return sdao.findByPk(id);
	}

	
	public List<Student> selctAllHql()
	{
		return sdao.findAllUsingHql();
	}

	public List<Student> selectAllCriteria() 
	{
		return sdao.findAllUsingCriteria();
	}
}
