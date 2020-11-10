package tr.gov.csb.edenetim.enm;

import java.util.stream.Stream;

public enum KirlilikTurEnum {

    KATI_ATIK(1, "Kati Atik"),
    EVSEL_ATIK(2, "Evsel Atik"),
    SINTINE(3, "Sintine"),
    AKARYAKIT(4, "Akaryakit"),
    MOTOR_YAT(5, "Motor Yat"),
    PETROL_TUREVLERI(6, "Petrol Turevleri"),
    KIRLI_BALAST(7, "Kirli Balast"),
    ATIK_TRANSFER_FORMU(8, "Atik Transfer Formu"),
    MAVI_KART_UYGULAMASI(9, "Mavi Kart Uygulamasi"),
    AKARYAKIT_SIZMASI(10, "Akaryakit Sizmasi"),
    COP(11, "cop"),
    DETERJAN(12, "Deterjan"),
    EVSEL_ATIKSU(13, "Evsel Atiksu"),
    GEMI_COPLERI(14, "Gemi Copleri"),
    HAM_PETROL(15, "Ham Petrol"),
    PETROL_VE_PETROL_TUREVLERI(16, "Petrol ve Petrol Turevleri"),
    PISSU(17, "Pissu"),
    RASPA_TOZU(18, "Raspa Tozu"),
    SLAC_SLOP(19, "SLAC, SLOP"),
    TROL_DONANIMI(20, "Trol Donanimi"),
    YAGLI_ATIK(21, "Yagli Atik"),
    DIGER(22, "Diger");

    private int code;
    private String label;

    KirlilikTurEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static int valueOf(KirlilikTurEnum value) {
        for (KirlilikTurEnum r : KirlilikTurEnum.values()) {
            if (r == value)
                return r.getCode();
        }

        throw new IllegalArgumentException(value + " not supported.");
    }

    public static KirlilikTurEnum of(int code) {
        return Stream.of(KirlilikTurEnum.values())
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