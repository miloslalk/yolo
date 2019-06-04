package org.yolo.elearning.yoloServer.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yolo.elearning.yoloServer.dao.LessonsDAO;
import org.yolo.elearning.yoloServer.entity.Lessons;

@Service
public class LessonServiceImpl implements LessonService {
	
	private LessonsDAO lessonsDAO;;
	
	public LessonServiceImpl(LessonsDAO thelessonsDAO) {
		lessonsDAO = thelessonsDAO;
	}

	@Override
	@Transactional
	public List<Lessons> findAll() {
		return lessonsDAO.findAll();
	}

}
