package org.yolo.iuventa.yolo.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yolo.iuventa.yolo.entity.Lesson;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LessonDAOHibernateImpl implements LessonDAO {

    private EntityManager entityManager;

    @Autowired
    public LessonDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Lesson> findAll() {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Lesson> theQuery;
        theQuery = currentSession.createQuery("from Lesson", Lesson.class);

        // execute query and get result list
        List<Lesson> lessons = theQuery.getResultList();

        // return the results
        return lessons;
    }

    @Override
    public Lesson findById(int theId) {
        //get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee
        Lesson theLesson =
                currentSession.get(Lesson.class, theId);

        // return the employee
        return theLesson;
    }

    @Override
    public void save(Lesson theLesson) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theLesson);
    }

    @Override
    public void deleteById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Lesson where id=:lessonId");
        theQuery.setParameter("lessonId", theId);

        theQuery.executeUpdate();

    }
}
