package tr.gov.csb.edenetim.enm;

public enum GemiCinsEnum {

    TICARI_GEMI_YAT(1, "Ticari Gemi/Yat"),
    OZEL_YAT_TEKNE(2, "Özel Yat/Tekne"),
    BALIKCI_TEKNESI(3, "Balýkçý Teknesi"),
    GEZI_TEKNESI(4, "Gezi Teknesi"),
    KURU_YUK_GEMISI(5, "Kuru Yük Gemisi"),
    SERVIS_MOTORU(6, "Servis Motoru"),
    KARGO(7, "Kargo"),
    YOLCU_MOTORU(8, "Yolcu Motoru"),

    ACIK_DENIZ_FAALIYETLERI_DESTEK_GEMISI(9, "Açýk Deniz Faaliyetleri Destek Gemisi"),
    ARABA_TASIYICI_GEMI(10, "Araba Taþýyýcý Gemi"),
    ATIK_TOPLAMA_GEMISI(11, "Atýk Toplama Gemisi"),
    BALIK_AVLAMA_GEMISI(12, "Balýk Avlama Gemisi"),
    BALIKCI_GEMILERI(13, "Balýkçý Gemileri"),
    BALIKCILIK_YARDIMCI_GEMISI(14, "Balýkçýlýk Yardýmcý Gemisi"),
    BORU_DOSEME_GEMISI(15, "Boru Döþeme Gemisi"),
    CANLI_HAYVAN_TASIYICI_GEMI(16, "Canlý Hayvan Taþýyýcý Gemi"),
    CAMUR_GEMISI(17, "Çamur Gemisi"),
    CIMENTO_TASIYICI_GEMI(18, "Çimento Taþýyýcý Gemi"),
    DALGIC_GEMISI(19, "Dalgýç Gemisi"),
    DIGER_KARGO_GEMISI(20, "Diðer Kargo Gemisi"),
    DOKME_YUK_GEMISI(21, "Dökme Yük Gemisi"),
    FRIGORIFIK(22, "Frigorifik(Soðutma Depolu) Yük Gemisi"),
    GENEL_YUK_GEMILERI(23, "Genel Yük (Karýþýk Yük) Gemileri"),
    GEZINTI_GEMISI(24, "Gezinti (Tenezzüh) Gemisi"),
    KIMYASAL_TANKER(25, "Kimyasal Tanker"),
    KONTEYNER(26, "Konteyner"),
    OZEL_AMACLI_GEMILER(27, "Özel Amaçlý Gemiler"),
    OZEL_SURAT_TEKNESI(28, "Özel Sürat Teknesi"),
    OZEL_TEKNE(29, "Özel Tekne"),
    OZEL_YAT(30, "Özel Yat (Boyu 24 metre üzeri)"),
    PETROL_TANKERI(31, "Petrol Tankeri"),
    RO_RO(32, "Ro-Ro"),
    TANKER_SEKLINDEKI_BARCLAR(33, "Tanker Þeklindeki Barçlar"),
    TICARI_SURAT_TEKNESI(34, "Ticari Sürat Teknesi"),
    TICARI_YAT(35, "Ticari Yat"),
    YATLAR(36, "Yatlar"),
    YOLCU_GEMILERI(37, "Yolcu Gemileri"),
    YOLCU_GEMISI(38, "Yolcu Gemisi"),
    YUK_GEMISI(39, "Yük Gemisi"),
    YUK_KONTEYNIR_GEMISI(40, "Yük / Konteyner Gemisi"),
    DIGER(41, "Diðer");

    private int code;
    private String label;

    GemiCinsEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static GemiCinsEnum findByCode(Integer key) {
        GemiCinsEnum[] values = GemiCinsEnum.values();
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