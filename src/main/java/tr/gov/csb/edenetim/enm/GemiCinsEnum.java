package tr.gov.csb.edenetim.enm;

public enum GemiCinsEnum {

    TICARI_GEMI_YAT(1, "Ticari Gemi/Yat"),
    OZEL_YAT_TEKNE(2, "�zel Yat/Tekne"),
    BALIKCI_TEKNESI(3, "Bal�k�� Teknesi"),
    GEZI_TEKNESI(4, "Gezi Teknesi"),
    KURU_YUK_GEMISI(5, "Kuru Y�k Gemisi"),
    SERVIS_MOTORU(6, "Servis Motoru"),
    KARGO(7, "Kargo"),
    YOLCU_MOTORU(8, "Yolcu Motoru"),

    ACIK_DENIZ_FAALIYETLERI_DESTEK_GEMISI(9, "A��k Deniz Faaliyetleri Destek Gemisi"),
    ARABA_TASIYICI_GEMI(10, "Araba Ta��y�c� Gemi"),
    ATIK_TOPLAMA_GEMISI(11, "At�k Toplama Gemisi"),
    BALIK_AVLAMA_GEMISI(12, "Bal�k Avlama Gemisi"),
    BALIKCI_GEMILERI(13, "Bal�k�� Gemileri"),
    BALIKCILIK_YARDIMCI_GEMISI(14, "Bal�k��l�k Yard�mc� Gemisi"),
    BORU_DOSEME_GEMISI(15, "Boru D��eme Gemisi"),
    CANLI_HAYVAN_TASIYICI_GEMI(16, "Canl� Hayvan Ta��y�c� Gemi"),
    CAMUR_GEMISI(17, "�amur Gemisi"),
    CIMENTO_TASIYICI_GEMI(18, "�imento Ta��y�c� Gemi"),
    DALGIC_GEMISI(19, "Dalg�� Gemisi"),
    DIGER_KARGO_GEMISI(20, "Di�er Kargo Gemisi"),
    DOKME_YUK_GEMISI(21, "D�kme Y�k Gemisi"),
    FRIGORIFIK(22, "Frigorifik(So�utma Depolu) Y�k Gemisi"),
    GENEL_YUK_GEMILERI(23, "Genel Y�k (Kar���k Y�k) Gemileri"),
    GEZINTI_GEMISI(24, "Gezinti (Tenezz�h) Gemisi"),
    KIMYASAL_TANKER(25, "Kimyasal Tanker"),
    KONTEYNER(26, "Konteyner"),
    OZEL_AMACLI_GEMILER(27, "�zel Ama�l� Gemiler"),
    OZEL_SURAT_TEKNESI(28, "�zel S�rat Teknesi"),
    OZEL_TEKNE(29, "�zel Tekne"),
    OZEL_YAT(30, "�zel Yat (Boyu 24 metre �zeri)"),
    PETROL_TANKERI(31, "Petrol Tankeri"),
    RO_RO(32, "Ro-Ro"),
    TANKER_SEKLINDEKI_BARCLAR(33, "Tanker �eklindeki Bar�lar"),
    TICARI_SURAT_TEKNESI(34, "Ticari S�rat Teknesi"),
    TICARI_YAT(35, "Ticari Yat"),
    YATLAR(36, "Yatlar"),
    YOLCU_GEMILERI(37, "Yolcu Gemileri"),
    YOLCU_GEMISI(38, "Yolcu Gemisi"),
    YUK_GEMISI(39, "Y�k Gemisi"),
    YUK_KONTEYNIR_GEMISI(40, "Y�k / Konteyner Gemisi"),
    DIGER(41, "Di�er");

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