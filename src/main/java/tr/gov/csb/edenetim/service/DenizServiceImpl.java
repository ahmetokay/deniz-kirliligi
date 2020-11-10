package tr.gov.csb.edenetim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import tr.gov.csb.edenetim.converter.DenizConverter;
import tr.gov.csb.edenetim.entity.Deniz;
import tr.gov.csb.edenetim.model.DenizModel;
import tr.gov.csb.edenetim.repository.DenizRepository;

import java.util.List;
import java.util.Optional;

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
    public DenizModel save(DenizModel deniz) {
        return converter.convertToDto(repository.save(converter.convertToEntity(deniz)));
    }

    @Override
    public DenizModel update(DenizModel deniz) {
        return converter.convertToDto(repository.save(converter.convertToEntity(deniz)));
    }

    @Override
    public DenizModel get(Long id) {
        Optional<Deniz> deniz = repository.findById(id);
        if (deniz.isPresent()) {
            return converter.convertToDto(deniz.get());
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        Optional<Deniz> deniz = repository.findById(id);
        if (deniz.isPresent()) {
            repository.delete(deniz.get());
            return true;
        }
        return false;
    }

    @Override
    public Resource getTutanak(Long id) {
        Optional<Deniz> deniz = repository.findById(id);
        if (deniz.isPresent()) {
            return new ByteArrayResource(deniz.get().getTutanak(), deniz.get().getTutanakAd());
        }
        return null;
    }
}