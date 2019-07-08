package org.yolo.iuventa.yolo.dao;

import org.yolo.iuventa.yolo.entity.Sections;

import java.util.List;

public interface SectionDAO {

public List<Sections> findAll();
public Sections findById(int theId);

}
