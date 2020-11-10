package tr.gov.csb.edenetim.converter;

import org.springframework.stereotype.Component;
import tr.gov.csb.edenetim.core.AbstractBaseConverter;
import tr.gov.csb.edenetim.entity.Deniz;
import tr.gov.csb.edenetim.model.DenizModel;

@Component
public class DenizConverter  extends AbstractBaseConverter<DenizModel, Deniz> {

    @Override
    protected void doConvertToDto(DenizModel dto, Deniz entity) {
        dto.setGemiAdi(entity.getGemiAdi());
    }

    @Override
    protected void doConvertToEntity(Deniz entity, DenizModel dto) {
        entity.setGemiAdi(dto.getGemiAdi());
    }
}
