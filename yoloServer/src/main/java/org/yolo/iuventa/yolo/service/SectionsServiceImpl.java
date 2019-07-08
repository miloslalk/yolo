package org.yolo.iuventa.yolo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yolo.iuventa.yolo.dao.SectionDAO;
import org.yolo.iuventa.yolo.entity.Sections;

import java.util.List;

@Service
public class SectionsServiceImpl implements SectionsService {

    private SectionDAO sectionDAO;

    @Autowired
    public SectionsServiceImpl(SectionDAO theSectionDAO) {
        sectionDAO = theSectionDAO;
    }

    @Override
    @Transactional
    public List<Sections> findAll() {
        return sectionDAO.findAll();
    }

    @Override
    @Transactional
    public Sections findById(int theId) {
        return sectionDAO.findById(theId);
    }
}
