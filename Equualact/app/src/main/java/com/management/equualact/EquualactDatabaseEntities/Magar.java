package com.management.equualact.EquualactDatabaseEntities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by User on 10/31/2017.
 */
@Entity
public class Magar {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idMagar")
    private long idMagar;

    @ColumnInfo(name = "nume")
    private String nume;

    @ColumnInfo(name = "dataNasterii")
    private Date dataNasterii;

    @ColumnInfo(name = "provenienta")
    private String provenienta;

    @ColumnInfo(name = "dataAchizitie")
    private Date dataAchizitie;

    @ColumnInfo(name = "nrCip")
    private String nrCip;

    @ColumnInfo(name = "sex")
    private String sex;

    @ColumnInfo(name = "activ")
    private boolean isActiv;

    public Magar(String nume, Date dataNasterii, String provenienta, Date dataAchizitie, String nrCip,
                 String sex, boolean isActiv) {
        this.nume = nume;
        this.dataNasterii = dataNasterii;
        this.provenienta = provenienta;
        this.dataAchizitie = dataAchizitie;
        this.nrCip = nrCip;
        this.sex = sex;
        this.isActiv = isActiv;
    }

    public long getIdMagar() {
        return idMagar;
    }

    public void setIdMagar(long idMagar) {
        this.idMagar = idMagar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getProvenienta() {
        return provenienta;
    }

    public void setProvenienta(String provenienta) {
        this.provenienta = provenienta;
    }

    public Date getDataAchizitie() {
        return dataAchizitie;
    }

    public void setDataAchizitie(Date dataAchizitie) {
        this.dataAchizitie = dataAchizitie;
    }

    public String getNrCip() {
        return nrCip;
    }

    public void setNrCip(String nrCip) {
        this.nrCip = nrCip;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isActiv() {
        return isActiv;
    }

    public void setActiv(boolean activ) {
        isActiv = activ;
    }
}
