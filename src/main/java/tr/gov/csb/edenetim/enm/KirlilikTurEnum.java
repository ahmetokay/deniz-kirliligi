package tr.gov.csb.edenetim.enm;

public enum KirlilikTurEnum {

    KATI_ATIK(1, "Kat� At�k"),
    EVSEL_ATIK(2, "Evsel At�k"),
    SINTINE(3, "Sintine"),
    AKARYAKIT(4, "Akaryak�t"),
    MOTOR_YAT(5, "Motor Yat"),
    PETROL_TUREVLERI(6, "Petrol T�revleri"),
    KIRLI_BALAST(7, "Kirli Balast"),
    ATIK_TRANSFER_FORMU(8, "At�k Transfer Formu"),
    MAVI_KART_UYGULAMASI(9, "Mavi Kart Uygulamas�"),
    AKARYAKIT_SIZMASI(10, "Akaryak�t S�zmas�"),
    COP(11, "��p"),
    DETERJAN(12, "Deterjan"),
    EVSEL_ATIKSU(13, "Evsel At�ksu"),
    GEMI_COPLERI(14, "Gemi ��pleri"),
    HAM_PETROL(15, "Ham Petrol"),
    PETROL_VE_PETROL_TUREVLERI(16, "Petrol ve Petrol T�revleri"),
    PISSU(17, "Pissu"),
    RASPA_TOZU(18, "Raspa Tozu"),
    SLAC_SLOP(19, "SLA�, SLOP"),
    TROL_DONANIMI(20, "Trol Donan�m�"),
    YAGLI_ATIK(21, "Ya�l� At�k"),
    DIGER(22, "Di�er");

    private int code;
    private String label;

    KirlilikTurEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static KirlilikTurEnum findByCode(Integer key) {
        KirlilikTurEnum[] values = KirlilikTurEnum.values();
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