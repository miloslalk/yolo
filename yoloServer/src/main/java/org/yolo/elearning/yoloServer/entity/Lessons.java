package org.yolo.elearning.yoloServer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class Lessons {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLesson")
	private int id;
	
	@Column(name = "lessonName")
	private String lessonName;
	
	public Lessons() {
		//empty constructor
	}

	public Lessons(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	@Override
	public String toString() {
		return "Lessons [id=" + id + ", lessonName=" + lessonName + "]";
	}
	
	
	
}
