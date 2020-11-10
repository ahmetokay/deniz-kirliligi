package tr.gov.csb.edenetim.converter;

import tr.gov.csb.edenetim.enm.DenetimKonuEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DenetimKonuEnumConverter implements AttributeConverter<DenetimKonuEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DenetimKonuEnum value) {
        if (value == null)
            return null;

        return DenetimKonuEnum.valueOf(value);
    }

    @Override
    public DenetimKonuEnum convertToEntityAttribute(Integer value) {
        if (value == null)
            return null;

        return DenetimKonuEnum.of(value);
    }
}