package tr.gov.csb.edenetim.converter;

import org.springframework.stereotype.Component;
import tr.gov.csb.edenetim.core.AbstractBaseConverter;
import tr.gov.csb.edenetim.entity.Deniz;
import tr.gov.csb.edenetim.model.DenizModel;

@Component
public class DenizConverter  extends AbstractBaseConverter<DenizModel, Deniz> {

    @Override
    protected void doConvertToDto(DenizModel dto, Deniz entity) {
        dto.setActive(entity.getActive());
        dto.setCreateDate(entity.getCreateDate());
        dto.setUserId(entity.getUserId());
        dto.setDenetimTarihi(entity.getDenetimTarihi());
        dto.setDenetimYapanKurum(entity.getDenetimYapanKurum());
        dto.setDenetimYapanBot(entity.getDenetimYapanBot());
        dto.setDenetimKonusu(entity.getDenetimKonusu());
        dto.setGemiAdi(entity.getGemiAdi());
        dto.setImo(entity.getImo());
        dto.setBandirasi(entity.getBandirasi());
        dto.setGemiCinsi(entity.getGemiCinsi());
        dto.setGrosTon(entity.getGrosTon());
        dto.setMevki(entity.getMevki());
        dto.setIhlalVar(entity.getIhlalVar());
        dto.setKanunMaddesiId(entity.getKanunMaddesiId());
        dto.setIhlal(entity.getIhlal());
        dto.setIlKodu(entity.getIlKodu());
        dto.setSahipUnvan(entity.getSahipUnvan());
        dto.setSahipAdres(entity.getSahipAdres());
        dto.setSahipTelefon(entity.getSahipTelefon());
        dto.setIsletenUnvan(entity.getIsletenUnvan());
        dto.setIsletenAdres(entity.getIsletenAdres());
        dto.setIsletenTelefon(entity.getIsletenTelefon());
        dto.setCagriIsaret(entity.getCagriIsaret());
        dto.setKaptanAdSoyad(entity.getKaptanAdSoyad());
        dto.setKaptanTckn(entity.getKaptanTckn());
        dto.setKirlilikTur(entity.getKirlilikTur());
        dto.setAciklama(entity.getAciklama());
        dto.setDenetci1(entity.getDenetci1());
        dto.setDenetci2(entity.getDenetci2());
        dto.setCezaIptal(entity.getCezaIptal());
        dto.setIptalAciklama(entity.getIptalAciklama());
        dto.setYapilanIslem(entity.getYapilanIslem());
        dto.setCezaTutar(entity.getCezaTutar());
        dto.setTutanakAd(entity.getTutanakAd());
    }

    @Override
    protected void doConvertToEntity(Deniz entity, DenizModel dto) {
        entity.setActive(dto.getActive());
        entity.setCreateDate(dto.getCreateDate());
        entity.setUserId(dto.getUserId());
        entity.setDenetimTarihi(dto.getDenetimTarihi());
        entity.setDenetimYapanKurum(dto.getDenetimYapanKurum());
        entity.setDenetimYapanBot(dto.getDenetimYapanBot());
        entity.setDenetimKonusu(dto.getDenetimKonusu());
        entity.setGemiAdi(dto.getGemiAdi());
        entity.setImo(dto.getImo());
        entity.setBandirasi(dto.getBandirasi());
        entity.setGemiCinsi(dto.getGemiCinsi());
        entity.setGrosTon(dto.getGrosTon());
        entity.setMevki(dto.getMevki());
        entity.setIhlalVar(dto.getIhlalVar());
        entity.setKanunMaddesiId(dto.getKanunMaddesiId());
        entity.setIhlal(dto.getIhlal());
        entity.setIlKodu(dto.getIlKodu());
        entity.setSahipUnvan(dto.getSahipUnvan());
        entity.setSahipAdres(dto.getSahipAdres());
        entity.setSahipTelefon(dto.getSahipTelefon());
        entity.setIsletenUnvan(dto.getIsletenUnvan());
        entity.setIsletenAdres(dto.getIsletenAdres());
        entity.setIsletenTelefon(dto.getIsletenTelefon());
        entity.setCagriIsaret(dto.getCagriIsaret());
        entity.setKaptanAdSoyad(dto.getKaptanAdSoyad());
        entity.setKaptanTckn(dto.getKaptanTckn());
        entity.setKirlilikTur(dto.getKirlilikTur());
        entity.setAciklama(dto.getAciklama());
        entity.setDenetci1(dto.getDenetci1());
        entity.setDenetci2(dto.getDenetci2());
        entity.setCezaIptal(dto.getCezaIptal());
        entity.setIptalAciklama(dto.getIptalAciklama());
        entity.setYapilanIslem(dto.getYapilanIslem());
        entity.setCezaTutar(dto.getCezaTutar());
        entity.setTutanakAd(dto.getTutanakAd());
    }
}
