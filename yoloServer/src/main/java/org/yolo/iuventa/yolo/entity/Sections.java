package org.yolo.iuventa.yolo.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name = "sections")
public class Sections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_section")
    private int idSection;

    @ManyToOne
    @JoinColumn(name = "lesson_id_lesson")
    private Lesson lesson;


    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "section_description")
    private String sectionDescription;

    @Column(name = "video_url")
    private String videoUrl;

    public Sections() {
    }

    public Sections(Lesson lesson, String sectionName, String sectionDescription, String videoUrl) {
        this.lesson = lesson;
        this.sectionName = sectionName;
        this.sectionDescription = sectionDescription;
        this.videoUrl = videoUrl;
    }

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Sections{" +
                "idSection=" + idSection +
                ", lesson=" + lesson +
                ", sectionName='" + sectionName + '\'' +
                ", sectionDescription='" + sectionDescription + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}
