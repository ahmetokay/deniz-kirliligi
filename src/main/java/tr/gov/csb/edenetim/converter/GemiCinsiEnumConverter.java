package tr.gov.csb.edenetim.converter;

import tr.gov.csb.edenetim.enm.GemiCinsEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class GemiCinsiEnumConverter implements AttributeConverter<GemiCinsEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(GemiCinsEnum value) {
        if (value == null)
            return null;

        return GemiCinsEnum.valueOf(value);
    }

    @Override
    public GemiCinsEnum convertToEntityAttribute(Integer value) {
        if (value == null)
            return null;

        return GemiCinsEnum.of(value);
    }
}