package tr.gov.csb.edenetim.service;

import org.springframework.core.io.Resource;
import tr.gov.csb.edenetim.model.DenizModel;

import java.util.List;

public interface DenizService {

    List<DenizModel> list();

    DenizModel save(DenizModel deniz);

    DenizModel update(DenizModel deniz);

    DenizModel get(Long id);

    boolean delete(Long id);

    Resource getTutanak(Long id);

    //TODO ahmet: search de gerekebilir
}