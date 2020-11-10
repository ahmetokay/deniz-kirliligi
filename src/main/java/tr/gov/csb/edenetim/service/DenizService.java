package tr.gov.csb.edenetim.service;

import tr.gov.csb.edenetim.model.DenizModel;

import java.util.List;

public interface DenizService {

    List<DenizModel> list();

    void save(DenizModel deniz);

    void update(DenizModel deniz);
}