package com.app.PorfotlioWalterRossi.models;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_exp")
    private Long idExp;

    @Column(length = 255, nullable = false, name = "title_exp")
    private String titleExp;

    @Column(length = 255, nullable = false, name = "start_exp")
    private String startExp;
    
    @Column(length = 255, nullable = false, name = "end_exp")
    private String endExp;
    

    @Column(length = 500, name = "loc_exp", nullable = false)
    private String locExp;

    @Column(length = 1000, name = "pic_exp", nullable = false)
    private String picExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String titleExp, String startExp, String endExp, String locExp, String picExp) {
        this.idExp = idExp;
        this.titleExp = titleExp;
        this.startExp = startExp;
        this.endExp = endExp;
        this.locExp = locExp;
        this.picExp = picExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public String getTitleExp() {
        return titleExp;
    }

    public String getStartExp() {
        return startExp;
    }

    public String getEndExp() {
        return endExp;
    }

    public String getLocExp() {
        return locExp;
    }

    public String getPicExp() {
        return picExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public void setTitleExp(String titleExp) {
        this.titleExp = titleExp;
    }

    public void setStartExp(String startExp) {
        this.startExp = startExp;
    }

    public void setEndExp(String endExp) {
        this.endExp = endExp;
    }

    public void setLocExp(String locExp) {
        this.locExp = locExp;
    }

    public void setPicExp(String picExp) {
        this.picExp = picExp;
    }

}