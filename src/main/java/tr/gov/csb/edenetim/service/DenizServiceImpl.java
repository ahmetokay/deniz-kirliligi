package tr.gov.csb.edenetim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.gov.csb.edenetim.converter.DenizConverter;
import tr.gov.csb.edenetim.entity.Deniz;
import tr.gov.csb.edenetim.model.DenizModel;
import tr.gov.csb.edenetim.repository.DenizRepository;

import java.util.List;

@Component
public class DenizServiceImpl implements DenizService {

    @Autowired
    private DenizConverter converter;

    @Autowired
    private DenizRepository repository;


    @Override
    public List<DenizModel> list() {
        List<Deniz> denizList = (List<Deniz>) repository.findAll();
        return converter.convertToDtoList(denizList);
    }

    @Override
    public void save(DenizModel deniz) {

    }

    @Override
    public void update(DenizModel deniz) {

    }
}