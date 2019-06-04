package org.yolo.elearning.yoloServer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yolo.elearning.yoloServer.entity.Lessons;

@Repository
public class LessonsDAOHibernateImpl implements LessonsDAO {

	private EntityManager entityManager;

	@Autowired
	public LessonsDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Lessons> findAll() {

		// get the current hibernate session
		Session currentSesssion = entityManager.unwrap(Session.class);

		// create a query
		Query<Lessons> theQuery = currentSesssion.createQuery("from Lesson", Lessons.class);

		// execute query
		List<Lessons> lessons = theQuery.getResultList();

		return lessons;
	}

}
