package tr.gov.csb.edenetim.enm;

import java.util.stream.Stream;

public enum GemiCinsEnum {

    TICARI_GEMI_YAT(1, "Ticari Gemi/Yat"),
    OZEL_YAT_TEKNE(2, "Ozel Yat/Tekne"),
    BALIKCI_TEKNESI(3, "Balikci Teknesi"),
    GEZI_TEKNESI(4, "Gezi Teknesi"),
    KURU_YUK_GEMISI(5, "Kuru Yuk Gemisi"),
    SERVIS_MOTORU(6, "Servis Motoru"),
    KARGO(7, "Kargo"),
    YOLCU_MOTORU(8, "Yolcu Motoru"),
    ACIK_DENIZ_FAALIYETLERI_DESTEK_GEMISI(9, "Acik Deniz Faaliyetleri Destek Gemisi"),
    ARABA_TASIYICI_GEMI(10, "Araba Tasiyici Gemi"),
    ATIK_TOPLAMA_GEMISI(11, "Atik Toplama Gemisi"),
    BALIK_AVLAMA_GEMISI(12, "Balik Avlama Gemisi"),
    BALIKCI_GEMILERI(13, "Balikci Gemileri"),
    BALIKCILIK_YARDIMCI_GEMISI(14, "Balikcilik Yardimci Gemisi"),
    BORU_DOSEME_GEMISI(15, "Boru Doseme Gemisi"),
    CANLI_HAYVAN_TASIYICI_GEMI(16, "Canli Hayvan Tasiyici Gemi"),
    CAMUR_GEMISI(17, "Camur Gemisi"),
    CIMENTO_TASIYICI_GEMI(18, "Cimento Tasiyici Gemi"),
    DALGIC_GEMISI(19, "Dalgic Gemisi"),
    DIGER_KARGO_GEMISI(20, "Diger Kargo Gemisi"),
    DOKME_YUK_GEMISI(21, "Dokme Yuk Gemisi"),
    FRIGORIFIK(22, "Frigorifik(Sogutma Depolu) Yuk Gemisi"),
    GENEL_YUK_GEMILERI(23, "Genel Yuk (Karisik Yuk) Gemileri"),
    GEZINTI_GEMISI(24, "Gezinti (Tenezzuh) Gemisi"),
    KIMYASAL_TANKER(25, "Kimyasal Tanker"),
    KONTEYNER(26, "Konteyner"),
    OZEL_AMACLI_GEMILER(27, "Ozel Amacli Gemiler"),
    OZEL_SURAT_TEKNESI(28, "Ozel Surat Teknesi"),
    OZEL_TEKNE(29, "Ozel Tekne"),
    OZEL_YAT(30, "Ozel Yat (Boyu 24 metre uzeri)"),
    PETROL_TANKERI(31, "Petrol Tankeri"),
    RO_RO(32, "Ro-Ro"),
    TANKER_SEKLINDEKI_BARCLAR(33, "Tanker seklindeki Barclar"),
    TICARI_SURAT_TEKNESI(34, "Ticari Surat Teknesi"),
    TICARI_YAT(35, "Ticari Yat"),
    YATLAR(36, "Yatlar"),
    YOLCU_GEMILERI(37, "Yolcu Gemileri"),
    YOLCU_GEMISI(38, "Yolcu Gemisi"),
    YUK_GEMISI(39, "Yuk Gemisi"),
    YUK_KONTEYNIR_GEMISI(40, "Yuk / Konteyner Gemisi"),
    DIGER(41, "Diger");

    private int code;
    private String label;

    GemiCinsEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static int valueOf(GemiCinsEnum value) {
        for (GemiCinsEnum r : GemiCinsEnum.values()) {
            if (r == value)
                return r.getCode();
        }

        throw new IllegalArgumentException(value + " not supported.");
    }

    public static GemiCinsEnum of(int code) {
        return Stream.of(GemiCinsEnum.values())
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