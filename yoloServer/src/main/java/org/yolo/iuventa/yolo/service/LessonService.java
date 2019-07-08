package org.yolo.iuventa.yolo.service;

import org.yolo.iuventa.yolo.entity.Lesson;

import java.util.List;

public interface LessonService {

    public List<Lesson> findAll();

    public Lesson findById(int theId);

    public void save (Lesson theLesson);

    public void deleteById (int theId);

}
