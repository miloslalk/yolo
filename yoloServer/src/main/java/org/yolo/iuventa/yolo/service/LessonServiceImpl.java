package org.yolo.iuventa.yolo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yolo.iuventa.yolo.dao.LessonDAO;
import org.yolo.iuventa.yolo.entity.Lesson;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    private LessonDAO lessonDAO;

    @Autowired
    public LessonServiceImpl(LessonDAO theLessonDAO) {
        lessonDAO = theLessonDAO;
    }

    @Override
    @Transactional
    public List<Lesson> findAll() {
        return lessonDAO.findAll();
    }

    @Override
    @Transactional
    public Lesson findById(int theId) {
        return lessonDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Lesson theLesson) {
        lessonDAO.save(theLesson);

    }

    @Override
    @Transactional
    public void delete(int theId) {
        lessonDAO.deleteById(theId);
    }
}
