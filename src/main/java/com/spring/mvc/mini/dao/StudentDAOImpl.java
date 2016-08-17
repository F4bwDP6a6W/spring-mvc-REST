package com.spring.mvc.mini.dao;

import com.spring.mvc.mini.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addStudent(Student p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Student saved successfully, Student Details="+p);
	}

	@Override
	public void updateStudent(Student p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Student updated successfully, Student Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listStudents() {
		Session session = this.sessionFactory.getCurrentSession
				();
		List<Student> studentsList = session.createQuery("from Student").list();
		for(Student p : studentsList){
			logger.info("Student List::"+p);
		}
		return studentsList;
	}

	@Override
	public Student getStudentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		logger.info("Student id in DAO:" + id);
		Student p = (Student) session.get(Student.class, id);
		logger.info("Student loaded successfully, Student details="+p);
		return p;
	}

	@Override
	public void removeStudent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Student p = (Student) session.load(Student.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Student deleted successfully, student details="+p);
	}

}
