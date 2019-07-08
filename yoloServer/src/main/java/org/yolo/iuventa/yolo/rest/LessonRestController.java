package org.yolo.iuventa.yolo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yolo.iuventa.yolo.entity.Lesson;
import org.yolo.iuventa.yolo.service.LessonService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LessonRestController {

    private LessonService lessonService;

    @Autowired
    public LessonRestController(LessonService theLessonService) {
        lessonService = theLessonService;
    }

    @GetMapping(value = "/lessons")
    public List<Lesson> findAll() {
        return lessonService.findAll();
    }

    @GetMapping(value = "/lessons/{lessonId}")
    public Lesson getLesson(@PathVariable int lessonId) {
        Lesson theLesson = lessonService.findById(lessonId);

        if (theLesson == null) {
            throw new RuntimeException("Lesson id not found - " + lessonId);
        }
        return theLesson;
    }

    @PostMapping(value = "/lessons")
    public Lesson addLesson(@RequestBody Lesson theLesson) {
        theLesson.setIdLesson(0);
        lessonService.save(theLesson);
        return theLesson;
    }

    @PutMapping(value = "/lessons")
    public Lesson updateLesson(@RequestBody Lesson theLesson) {
        lessonService.save(theLesson);
        return theLesson;
    }

    @DeleteMapping(value = "/lessons/{lessonId}")
    public String deleteLesson(@PathVariable int lessonId) {
        Lesson theLesson = lessonService.findById(lessonId);

        if (theLesson == null) {
            throw new RuntimeException("Employee id not found - " + lessonId);
        }

        lessonService.deleteById(lessonId);

        return "Deleted employee id - " + lessonId;
    }
}
