package org.yolo.iuventa.yolo.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yolo.iuventa.yolo.entity.Sections;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SectionDAOHibernateImpl implements SectionDAO {

    private EntityManager entityManager;

    @Autowired
    public SectionDAOHibernateImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Sections> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Sections> theQuery = currentSession.createQuery("from Sections", Sections.class);

        List<Sections> sections = theQuery.getResultList();

        return sections;
    }

    @Override
    public Sections findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Sections theSection = currentSession.get(Sections.class, theId);

        return theSection;
    }
}

