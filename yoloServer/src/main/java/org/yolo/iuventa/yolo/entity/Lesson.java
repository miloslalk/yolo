package org.yolo.iuventa.yolo.entity;

import javax.persistence.*;

@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lesson")
    private int idLesson;

    @Column(name = "lesson_Name")
    private String lessonName;

    @Column(name = "lesson_description")
    private String lessonDescription;

    public Lesson() {

    }

    public Lesson(String lessonName, String lessonDescription) {
        this.lessonName = lessonName;
        this.lessonDescription = lessonDescription;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonDescription() {
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription) {
        this.lessonDescription = lessonDescription;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "idLesson=" + idLesson +
                ", lessonName='" + lessonName + '\'' +
                ", lessonDescription='" + lessonDescription + '\'' +
                '}';
    }
}
