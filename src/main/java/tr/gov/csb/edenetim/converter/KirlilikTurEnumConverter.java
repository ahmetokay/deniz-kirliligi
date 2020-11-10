package tr.gov.csb.edenetim.converter;

import tr.gov.csb.edenetim.enm.KirlilikTurEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class KirlilikTurEnumConverter implements AttributeConverter<KirlilikTurEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(KirlilikTurEnum value) {
        if (value == null)
            return null;

        return KirlilikTurEnum.valueOf(value);
    }

    @Override
    public KirlilikTurEnum convertToEntityAttribute(Integer value) {
        if (value == null)
            return null;

        return KirlilikTurEnum.of(value);
    }
}