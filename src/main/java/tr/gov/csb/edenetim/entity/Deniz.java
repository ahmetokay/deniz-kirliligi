package tr.gov.csb.edenetim.entity;

import org.springframework.context.annotation.Lazy;
import tr.gov.csb.edenetim.converter.DenetimKonuEnumConverter;
import tr.gov.csb.edenetim.converter.GemiCinsiEnumConverter;
import tr.gov.csb.edenetim.converter.KirlilikTurEnumConverter;
import tr.gov.csb.edenetim.core.BaseEntity;
import tr.gov.csb.edenetim.enm.DenetimKonuEnum;
import tr.gov.csb.edenetim.enm.GemiCinsEnum;
import tr.gov.csb.edenetim.enm.KirlilikTurEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "YETKIDEVIR_DENIZ_KIRLILIGI", schema = "EDENETIM")
public class Deniz extends BaseEntity {

    @Column(name = "ACTIVE")
    private Integer active;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @Column(name = "YETKI_DEVIR_USERID")
    private Long userId;

    @Column(name = "DENETIMTARIHI")
    private Date denetimTarihi;

    @Column(name = "DENETIM_YAPAN_KURUM")
    private String denetimYapanKurum;

    @Column(name = "DENETIMYAPANBOT")
    private String denetimYapanBot;

//    @Enumerated(EnumType.ORDINAL)
//    @Convert(converter = DenetimKonuEnumConverter.class)
    @Column(name = "DENETIMKONUSU")
    private DenetimKonuEnum denetimKonusu;

    @Column(name = "GEMIADI")
    private String gemiAdi;

    @Column(name = "IMO")
    private Integer imo;

    @Column(name = "BANDIRASI")
    private String bandirasi;

//    @Enumerated(EnumType.ORDINAL)
//    @Convert(converter = GemiCinsiEnumConverter.class)
    @Column(name = "GEMICINSI")
    private GemiCinsEnum gemiCinsi;

    @Column(name = "GROS_TON")
    private Double grosTon;

    @Column(name = "MEVKI")
    private String mevki;

    @Column(name = "IHLALVARMI")
    private Integer ihlalVar;

    @Column(name = "CEVREKANUNUMADDESIID")
    private Integer kanunMaddesiId;

    @Column(name = "IHLAL")
    private String ihlal;

    @Column(name = "ILKODU")
    private Integer ilKodu;

    @Column(name = "SAHIP_UNVAN")
    private String sahipUnvan;

    @Column(name = "SAHIP_ADRES")
    private String sahipAdres;

    @Column(name = "SAHIP_TELEFON")
    private String sahipTelefon;

    @Column(name = "ISLETEN_UNVAN")
    private String isletenUnvan;

    @Column(name = "ISLETEN_ADRES")
    private String isletenAdres;

    @Column(name = "ISLETEN_TELEFON")
    private String isletenTelefon;

    @Column(name = "CAGRI_ISARET")
    private String cagriIsaret;

    @Column(name = "KAPTAN_ADSOYAD")
    private String kaptanAdSoyad;

    @Column(name = "KAPTAN_TCKN")
    private String kaptanTckn;

//    @Enumerated(EnumType.ORDINAL)
//    @Convert(converter = KirlilikTurEnumConverter.class)
    @Column(name = "KIRLILIK_TUR")
    private KirlilikTurEnum kirlilikTur;

    @Column(name = "ACIKLAMA")
    private String aciklama;

    @Column(name = "DENETCI1")
    private String denetci1;

    @Column(name = "DENETCI2")
    private String denetci2;

    @Column(name = "CEZA_IPTAL")
    private String cezaIptal;

    @Column(name = "IPTAL_ACIKLAMA")
    private String iptalAciklama;

    @Column(name = "YAPILAN_ISLEM")
    private String yapilanIslem;

    @Column(name = "IDARIYAPTIRIMTUTAR")
    private Double cezaTutar;

    @Lazy
    @Column(name = "TUTANAK")
    private byte[] tutanak;

    @Column(name = "TUTANAK_AD")
    private String tutanakAd;

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDenetimTarihi() {
        return denetimTarihi;
    }

    public void setDenetimTarihi(Date denetimTarihi) {
        this.denetimTarihi = denetimTarihi;
    }

    public String getDenetimYapanKurum() {
        return denetimYapanKurum;
    }

    public void setDenetimYapanKurum(String denetimYapanKurum) {
        this.denetimYapanKurum = denetimYapanKurum;
    }

    public String getDenetimYapanBot() {
        return denetimYapanBot;
    }

    public void setDenetimYapanBot(String denetimYapanBot) {
        this.denetimYapanBot = denetimYapanBot;
    }

    public DenetimKonuEnum getDenetimKonusu() {
        return denetimKonusu;
    }

    public void setDenetimKonusu(DenetimKonuEnum denetimKonusu) {
        this.denetimKonusu = denetimKonusu;
    }

    public String getGemiAdi() {
        return gemiAdi;
    }

    public void setGemiAdi(String gemiAdi) {
        this.gemiAdi = gemiAdi;
    }

    public Integer getImo() {
        return imo;
    }

    public void setImo(Integer imo) {
        this.imo = imo;
    }

    public String getBandirasi() {
        return bandirasi;
    }

    public void setBandirasi(String bandirasi) {
        this.bandirasi = bandirasi;
    }

    public GemiCinsEnum getGemiCinsi() {
        return gemiCinsi;
    }

    public void setGemiCinsi(GemiCinsEnum gemiCinsi) {
        this.gemiCinsi = gemiCinsi;
    }

    public Double getGrosTon() {
        return grosTon;
    }

    public void setGrosTon(Double grosTon) {
        this.grosTon = grosTon;
    }

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }

    public Integer getIhlalVar() {
        return ihlalVar;
    }

    public void setIhlalVar(Integer ihlalVar) {
        this.ihlalVar = ihlalVar;
    }

    public Integer getKanunMaddesiId() {
        return kanunMaddesiId;
    }

    public void setKanunMaddesiId(Integer kanunMaddesiId) {
        this.kanunMaddesiId = kanunMaddesiId;
    }

    public String getIhlal() {
        return ihlal;
    }

    public void setIhlal(String ihlal) {
        this.ihlal = ihlal;
    }

    public Integer getIlKodu() {
        return ilKodu;
    }

    public void setIlKodu(Integer ilKodu) {
        this.ilKodu = ilKodu;
    }

    public String getSahipUnvan() {
        return sahipUnvan;
    }

    public void setSahipUnvan(String sahipUnvan) {
        this.sahipUnvan = sahipUnvan;
    }

    public String getSahipAdres() {
        return sahipAdres;
    }

    public void setSahipAdres(String sahipAdres) {
        this.sahipAdres = sahipAdres;
    }

    public String getSahipTelefon() {
        return sahipTelefon;
    }

    public void setSahipTelefon(String sahipTelefon) {
        this.sahipTelefon = sahipTelefon;
    }

    public String getIsletenUnvan() {
        return isletenUnvan;
    }

    public void setIsletenUnvan(String isletenUnvan) {
        this.isletenUnvan = isletenUnvan;
    }

    public String getIsletenAdres() {
        return isletenAdres;
    }

    public void setIsletenAdres(String isletenAdres) {
        this.isletenAdres = isletenAdres;
    }

    public String getIsletenTelefon() {
        return isletenTelefon;
    }

    public void setIsletenTelefon(String isletenTelefon) {
        this.isletenTelefon = isletenTelefon;
    }

    public String getCagriIsaret() {
        return cagriIsaret;
    }

    public void setCagriIsaret(String cagriIsaret) {
        this.cagriIsaret = cagriIsaret;
    }

    public String getKaptanAdSoyad() {
        return kaptanAdSoyad;
    }

    public void setKaptanAdSoyad(String kaptanAdSoyad) {
        this.kaptanAdSoyad = kaptanAdSoyad;
    }

    public String getKaptanTckn() {
        return kaptanTckn;
    }

    public void setKaptanTckn(String kaptanTckn) {
        this.kaptanTckn = kaptanTckn;
    }

    public KirlilikTurEnum getKirlilikTur() {
        return kirlilikTur;
    }

    public void setKirlilikTur(KirlilikTurEnum kirlilikTur) {
        this.kirlilikTur = kirlilikTur;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDenetci1() {
        return denetci1;
    }

    public void setDenetci1(String denetci1) {
        this.denetci1 = denetci1;
    }

    public String getDenetci2() {
        return denetci2;
    }

    public void setDenetci2(String denetci2) {
        this.denetci2 = denetci2;
    }

    public String getCezaIptal() {
        return cezaIptal;
    }

    public void setCezaIptal(String cezaIptal) {
        this.cezaIptal = cezaIptal;
    }

    public String getIptalAciklama() {
        return iptalAciklama;
    }

    public void setIptalAciklama(String iptalAciklama) {
        this.iptalAciklama = iptalAciklama;
    }

    public String getYapilanIslem() {
        return yapilanIslem;
    }

    public void setYapilanIslem(String yapilanIslem) {
        this.yapilanIslem = yapilanIslem;
    }

    public Double getCezaTutar() {
        return cezaTutar;
    }

    public void setCezaTutar(Double cezaTutar) {
        this.cezaTutar = cezaTutar;
    }

    public byte[] getTutanak() {
        return tutanak;
    }

    public void setTutanak(byte[] tutanak) {
        this.tutanak = tutanak;
    }

    public String getTutanakAd() {
        return tutanakAd;
    }

    public void setTutanakAd(String tutanakAd) {
        this.tutanakAd = tutanakAd;
    }
}