package com.app.PorfotlioWalterRossi.models;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;

    @Column(length = 255, nullable = false, name = "title_edu")
    private String titleEdu;

    @Column(length = 255, nullable = false, name = "start_edu")
    private String startEdu;
    
    @Column(length = 255, nullable = false, name = "end_edu")
    private String endEdu;
    

    @Column(length = 500, name = "desc_edu", nullable = false)
    private String descEdu;

    @Column(length = 1000, name = "pic_edu", nullable = false)
    private String picEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String titleEdu, String startEdu, String endEdu, String descEdu, String picEdu) {
        this.idEdu = idEdu;
        this.titleEdu = titleEdu;
        this.startEdu = startEdu;
        this.endEdu = endEdu;
        this.descEdu = descEdu;
        this.picEdu = picEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public String getTitleEdu() {
        return titleEdu;
    }

    public String getStartEdu() {
        return startEdu;
    }

    public String getEndEdu() {
        return endEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public String getPicEdu() {
        return picEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public void setTitleEdu(String titleEdu) {
        this.titleEdu = titleEdu;
    }

    public void setStartEdu(String startEdu) {
        this.startEdu = startEdu;
    }

    public void setEndEdu(String endEdu) {
        this.endEdu = endEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public void setPicEdu(String picEdu) {
        this.picEdu = picEdu;
    }
 
}