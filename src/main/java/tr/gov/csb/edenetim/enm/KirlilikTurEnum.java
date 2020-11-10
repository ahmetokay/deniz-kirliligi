package tr.gov.csb.edenetim.enm;

public enum KirlilikTurEnum {

    KATI_ATIK(1, "Katý Atýk"),
    EVSEL_ATIK(2, "Evsel Atýk"),
    SINTINE(3, "Sintine"),
    AKARYAKIT(4, "Akaryakýt"),
    MOTOR_YAT(5, "Motor Yat"),
    PETROL_TUREVLERI(6, "Petrol Türevleri"),
    KIRLI_BALAST(7, "Kirli Balast"),
    ATIK_TRANSFER_FORMU(8, "Atýk Transfer Formu"),
    MAVI_KART_UYGULAMASI(9, "Mavi Kart Uygulamasý"),
    AKARYAKIT_SIZMASI(10, "Akaryakýt Sýzmasý"),
    COP(11, "Çöp"),
    DETERJAN(12, "Deterjan"),
    EVSEL_ATIKSU(13, "Evsel Atýksu"),
    GEMI_COPLERI(14, "Gemi Çöpleri"),
    HAM_PETROL(15, "Ham Petrol"),
    PETROL_VE_PETROL_TUREVLERI(16, "Petrol ve Petrol Türevleri"),
    PISSU(17, "Pissu"),
    RASPA_TOZU(18, "Raspa Tozu"),
    SLAC_SLOP(19, "SLAÇ, SLOP"),
    TROL_DONANIMI(20, "Trol Donanýmý"),
    YAGLI_ATIK(21, "Yaðlý Atýk"),
    DIGER(22, "Diðer");

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