package tr.gov.csb.edenetim.enm;

public enum DenizDenetimKonuEnum {

    DENIZ_KIRLILIGI(1, "Deniz Kirliliði"),
    ATIK_TRANSFER_FORMU(2, "Atýk Transfer Formu"),
    DIGER(3, "Diðer");

    private int code;
    private String label;

    DenizDenetimKonuEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static DenizDenetimKonuEnum findByCode(Integer key) {
        DenizDenetimKonuEnum[] values = DenizDenetimKonuEnum.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == key) {
                return values[i];
            }
        }

        return null;
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