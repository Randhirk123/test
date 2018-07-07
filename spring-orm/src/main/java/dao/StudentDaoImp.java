package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import model.Student;

public class StudentDaoImp implements StudentDao
{
	private HibernateTemplate ht;
	public void setHt(HibernateTemplate ht)
	{
		this.ht = ht;
		
	}
	@Transactional
	
	public int save(Student st) 
	{
		ht.flush();
		return (Integer)ht.save(st);
		
		
	}

	
	public boolean update(Student st) 
	{
		ht.update(st);
		return true;
	}

	
	public boolean delete(Student st)
	{
		ht.delete(st);
		return true;
	}


	public Student findByPk(int pk)
	{
		Student st=(Student)ht.get(Student.class, pk);
		return st;
	}

	
	

	public List<Student> findAllUsingHql()
	{
		List<Student> list=(List<Student>) ht.find("from Student");
		return list;
	}
	
	public List<Student> findAllUsingCriteria() 
	{
		DetachedCriteria dr=DetachedCriteria.forClass(Student.class);
		/*we can set projection as well as restrictions also */
		List<Student> list=(List<Student>) ht.findByCriteria(dr);
		return list;
	}

}
