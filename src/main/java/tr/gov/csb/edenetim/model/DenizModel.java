package tr.gov.csb.edenetim.model;

import tr.gov.csb.edenetim.core.BaseModel;
import tr.gov.csb.edenetim.enm.DenetimKonuEnum;
import tr.gov.csb.edenetim.enm.GemiCinsEnum;
import tr.gov.csb.edenetim.enm.KirlilikTurEnum;

import java.util.Date;

public class DenizModel extends BaseModel {

    private Integer active;
    private Date createDate;
    private Long userId;
    private Date denetimTarihi;
    private String denetimYapanKurum;
    private String denetimYapanBot;
    private DenetimKonuEnum denetimKonusu;
    private String gemiAdi;
    private Integer imo;
    private String bandirasi;
    private GemiCinsEnum gemiCinsi;
    private Double grosTon;
    private String mevki;
    private Integer ihlalVar;
    private Integer kanunMaddesiId;
    private String ihlal;
    private Integer ilKodu;
    private String sahipUnvan;
    private String sahipAdres;
    private String sahipTelefon;
    private String isletenUnvan;
    private String isletenAdres;
    private String isletenTelefon;
    private String cagriIsaret;
    private String kaptanAdSoyad;
    private String kaptanTckn;
    private KirlilikTurEnum kirlilikTur;
    private String aciklama;
    private String denetci1;
    private String denetci2;
    private String cezaIptal;
    private String iptalAciklama;
    private String yapilanIslem;
    private Double cezaTutar;
    private byte[] tutanak;
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