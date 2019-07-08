package org.yolo.iuventa.yolo.service;

import org.yolo.iuventa.yolo.entity.Sections;

import java.util.List;

public interface SectionsService {

    public List<Sections> findAll();

    public Sections findById(int theId);

}
