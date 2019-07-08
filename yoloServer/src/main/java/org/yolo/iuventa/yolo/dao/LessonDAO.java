package org.yolo.iuventa.yolo.dao;

import org.yolo.iuventa.yolo.entity.Lesson;

import java.util.List;

public interface LessonDAO {

    public List<Lesson> findAll();

    public Lesson findById(int theId);

    public void save (Lesson theLesson);

    public void deleteById(int theId);

}
