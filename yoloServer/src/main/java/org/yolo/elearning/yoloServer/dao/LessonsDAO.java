package org.yolo.elearning.yoloServer.dao;

import java.util.List;

import org.yolo.elearning.yoloServer.entity.Lessons;

public interface LessonsDAO {
	
	public List<Lessons> findAll();

}
