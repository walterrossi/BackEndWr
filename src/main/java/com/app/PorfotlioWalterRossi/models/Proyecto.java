package com.app.PorfotlioWalterRossi.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proyecto")
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_proyecto")
    private Long idProyecto;

    @Column(length = 255, nullable = false, name = "title_proyecto")
    private String titleProyecto;

    @Column(length = 255, name = "fecha_proyecto", nullable = false)
    private String fechaProyecto;

    @Column(length = 255, name = "ima_proyecto", nullable = false)
    private String imaProyecto;

    
    

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, String titleProyecto, String fechaProyecto, String imaProyecto) {
        this.idProyecto= idProyecto;
        this.titleProyecto = titleProyecto;
        this.fechaProyecto = fechaProyecto;
        this.imaProyecto= imaProyecto;
        
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public String getTitleProyecto() {
        return titleProyecto;
    }

    public String getFechaProyecto() {
        return fechaProyecto;
    }

    public String getImaProyecto() {
        return imaProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setTitleProyecto(String titleProyecto) {
        this.titleProyecto = titleProyecto;
    }

    public void setFechaProyecto(String fechaProyecto) {
        this.fechaProyecto = fechaProyecto;
    }

    public void setImaProyecto(String imaProyecto) {
        this.imaProyecto = imaProyecto;
    }

}

        