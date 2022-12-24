package com.app.PorfotlioWalterRossi.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hard")
public class Hard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_hard")
    private Long idHard;

    @Column(length = 255, nullable = false, name = "title_hard")
    private String titleHard;

    @Column(length = 255, name = "porc_hard", nullable = false)
    private String porcHard;


    public Hard() {
    }

    public Hard(Long idaHard, String titleHard, String porcHard) {
        this.idHard = idaHard;
        this.titleHard = titleHard;
        this.porcHard = porcHard;
        
    }

    public Long getIdHard() {
        return idHard;
    }

    public String getTitleHard() {
        return titleHard;
    }

    public String getPorcHard() {
        return porcHard;
    }

    public void setIdHard(Long idHard) {
        this.idHard = idHard;
    }

    public void setTitleHard(String titleHard) {
        this.titleHard = titleHard;
    }

    public void setPorcHard(String porcHard) {
        this.porcHard = porcHard;
    }

   
}

        