package org.yolo.iuventa.yolo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yolo.iuventa.yolo.entity.Sections;
import org.yolo.iuventa.yolo.service.SectionsService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SectionRestController {

    private SectionsService sectionsService;

    @Autowired
    public SectionRestController(SectionsService theSectionsService){
        sectionsService = theSectionsService;
    }

    @GetMapping(value = "/sections")
    public List<Sections> findAll(){
        return  sectionsService.findAll();
    }

    @GetMapping(value = "/sections/{idSection}")
    public Sections getSection(@PathVariable int idSection){

        Sections theSection = sectionsService.findById(idSection);
         if(theSection == null){
             throw new RuntimeException("Section id not found - " +idSection);
         }
         return theSection;

    }

}
