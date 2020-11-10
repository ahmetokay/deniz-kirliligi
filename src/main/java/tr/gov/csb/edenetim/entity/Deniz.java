package tr.gov.csb.edenetim.entity;

import tr.gov.csb.edenetim.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "YETKIDEVIR_DENIZ_KIRLILIGI", schema = "EDENETIM")
public class Deniz extends BaseEntity {

    @Column(name = "DENETIMTARIHI")
    private Date denetimTarihi;

    @Column(name = "DENETIMYAPANBOT")
    private String denetimYapanKurum;

    @Column(name = "GEMIADI")
    private String gemiAdi;

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

    public String getGemiAdi() {
        return gemiAdi;
    }

    public void setGemiAdi(String gemiAd) {
        this.gemiAdi = gemiAd;
    }
}