package caseStudy.service;

import caseStudy.model.Furama.Facitily;

import java.util.List;

public interface IManagementServise<O> {
    void addNew();

    List<O> displayList();

    void menuMail();
}
