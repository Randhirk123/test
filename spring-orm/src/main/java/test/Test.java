package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bussiness.StudentBo;
import model.Student;

public class Test
{
	
	public static void main(String[] args) 
	{
		Student st1=new Student();
		
		ApplicationContext cfg=new ClassPathXmlApplicationContext("resources/spring.xml");
		StudentBo st=(StudentBo)cfg.getBean("bo");
		st1.setId(1);
		st1.setName("Randhir");
		st1.setPassword("1234");
		st1.setEmail("Randhircs32@gmail.com");
		int status=st.createStudent(st1);
		System.out.println("Save SuucessFully"+" "+status);
	}
}
