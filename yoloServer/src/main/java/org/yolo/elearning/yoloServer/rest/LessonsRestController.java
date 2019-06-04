package org.yolo.elearning.yoloServer.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yolo.elearning.yoloServer.entity.Lessons;
import org.yolo.elearning.yoloServer.service.LessonService;

@RestController
//@RequestMapping("/api")
public class LessonsRestController {
	
	private LessonService lessonsService;
	
	@Autowired
	public LessonsRestController(LessonService theLessonsService) {
		lessonsService = theLessonsService;
	}
	
	@GetMapping("/lessons")
	public List<Lessons> findAll(){
		return lessonsService.findAll();
	}

}
