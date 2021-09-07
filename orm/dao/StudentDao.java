package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	//save

	@Transactional
	public int insert(Student student) {

		Integer i = (Integer) this.hibernateTemplate.save(student);

		// insert student

		return i;

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
