package tr.gov.csb.edenetim.enm;

import java.util.stream.Stream;

public enum DenetimKonuEnum {

    DENIZ_KIRLILIGI(1, "Deniz Kirliligi"),
    ATIK_TRANSFER_FORMU(2, "Atik Transfer Formu"),
    DIGER(3, "Diger"),
    DIGER2(4, "Diger");

    private int code;
    private String label;

    DenetimKonuEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static int valueOf(DenetimKonuEnum value) {
        for (DenetimKonuEnum r : DenetimKonuEnum.values()) {
            if (r == value)
                return r.getCode();
        }

        throw new IllegalArgumentException(value + " not supported.");
    }

    public static DenetimKonuEnum of(int code) {
        return Stream.of(DenetimKonuEnum.values())
                .filter(p -> p.getCode() == code)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int code() {
        return code;
    }

    public String label() {
        return label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}